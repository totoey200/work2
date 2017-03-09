package com.example.lg.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Temp extends AppCompatActivity {
    EditText c,f;
    Button c_cal,f_cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        setTitle("온도변환기");

        init();
        c_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = c.getText().toString();
                double result = Double.parseDouble(num)*1.8 + 32;

                Toast.makeText(getApplicationContext(),"화씨 온도는 "+result+"도 입니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });
        f_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = f.getText().toString();
                double result = (Double.parseDouble(num)-32)/1.8;

                Toast.makeText(getApplicationContext(),"섭씨 온도는 "+result+"도 입니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    void init(){
        c = (EditText)findViewById(R.id.input_c);
        f = (EditText)findViewById(R.id.input_f);
        c_cal = (Button) findViewById(R.id.c_cal);
        f_cal = (Button) findViewById(R.id.f_cal);
    }
}
