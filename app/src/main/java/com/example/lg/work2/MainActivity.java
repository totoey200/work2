package com.example.lg.work2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button old,temp,order,cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("각종 계산기");

        init();
        old.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent old_intent = new Intent(MainActivity.this,Old_cal.class);
                startActivity(old_intent);
            }
        });
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp_intent = new Intent(MainActivity.this,Temp.class);
                startActivity(temp_intent);
            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent order_intent = new Intent(MainActivity.this,Order.class);
                startActivity(order_intent);
            }
        });
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cal_intent = new Intent(MainActivity.this,Cal.class);
                startActivity(cal_intent);
            }
        });
    }

    void init(){
        old = (Button)findViewById(R.id.year);
        temp = (Button)findViewById(R.id.temp);
        order = (Button)findViewById(R.id.order);
        cal = (Button)findViewById(R.id.cal);
    }

}
