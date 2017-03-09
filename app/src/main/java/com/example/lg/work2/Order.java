package com.example.lg.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Order extends AppCompatActivity {
    EditText pi_cnt,spa_cnt,sal_cnt;
    CheckBox cb;
    TextView tv_cnt,tv_price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        setTitle("레스토랑 메뉴 주문");


    }
    void init(){
        pi_cnt = (EditText)findViewById(R.id.input_pizza);
        spa_cnt = (EditText)findViewById(R.id.input_spa);
        sal_cnt = (EditText)findViewById(R.id.input_sal);
        cb = (CheckBox)findViewById(R.id.)
    }
}
