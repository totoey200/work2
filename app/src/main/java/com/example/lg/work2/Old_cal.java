package com.example.lg.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Old_cal extends AppCompatActivity {
    EditText year,old;
    Button year_cal,old_cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_cal);
        setTitle("나이 계산기");

        init();
        year_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = year.getText().toString();
                int result = 2017 - Integer.parseInt(input) + 1;
                Toast.makeText(getApplicationContext(),"당신의 나이는 "+result+"세 입니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        old_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = old.getText().toString();
                int result = 2017 - Integer.parseInt(input) + 1;
                Toast.makeText(getApplicationContext(),"당신의 나이는 "+result+"년 입니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    void init(){
        year = (EditText)findViewById(R.id.input_year);
        old = (EditText)findViewById(R.id.input_old);
        year_cal = (Button)findViewById(R.id.year_cal);
        old_cal = (Button)findViewById(R.id.old_cal);
    }
}
