package com.example.lg.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Order extends AppCompatActivity {
    EditText pi_cnt,spa_cnt,sal_cnt;
    CheckBox cb;
    Button cal;
    TextView tv_cnt,tv_price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        setTitle("레스토랑 메뉴 주문");

        init();

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pizza = pi_cnt.getText().toString();
                String spa = spa_cnt.getText().toString();
                String sal = sal_cnt.getText().toString();
                int result=0;
                int cnt = 0;
                if(pizza.equals("")){
                    pi_cnt.setText("0");
                }
                else{
                    result += Integer.parseInt(pizza)*15000;
                    cnt += Integer.parseInt(pizza);
                }
                if(spa.equals("")){
                    spa_cnt.setText("0");
                }
                else{
                    result += Integer.parseInt(spa)*13000;
                    cnt += Integer.parseInt(spa);
                }
                if(sal.equals("")){
                    sal_cnt.setText("0");
                }
                else{
                    result += Integer.parseInt(sal)*9000;
                    cnt += Integer.parseInt(sal);
                }
                if(cb.isChecked()){
                    result *= 0.9;
                }
                tv_cnt.setText(Integer.toString(cnt));
                tv_price.setText(Integer.toString(result));
            }
        });
    }
    void init(){
        pi_cnt = (EditText)findViewById(R.id.input_pizza);
        spa_cnt = (EditText)findViewById(R.id.input_spa);
        sal_cnt = (EditText)findViewById(R.id.input_sal);
        cb = (CheckBox)findViewById(R.id.cb);
        cal = (Button)findViewById(R.id.order_cal);
        tv_cnt = (TextView)findViewById(R.id.result_order_count);
        tv_price = (TextView)findViewById(R.id.result_order_price);
    }
}
