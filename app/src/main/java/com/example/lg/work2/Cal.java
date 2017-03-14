package com.example.lg.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cal extends AppCompatActivity {

    EditText num1,num2;
    Button plus_btn,minus_btn,multi_btn,divd_btn;
    String input1;
    String input2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        setTitle("계산기");
        init();
        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = num1.getText().toString();
                input2 = num2.getText().toString();
                if (input1.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                    num1.requestFocus();
                }
                else if(input2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                    num2.requestFocus();
                }
                else{
                    int result = Integer.parseInt(input1)+Integer.parseInt(input2);
                    Toast.makeText(getApplicationContext(),"더하기 계산 결과는 "+result+"입니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = num1.getText().toString();
                input2 = num2.getText().toString();
                if (input1.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                    num1.requestFocus();
                }
                else if(input2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                    num2.requestFocus();
                }
                else{
                    int result = Integer.parseInt(input1)-Integer.parseInt(input2);
                    Toast.makeText(getApplicationContext(),"빼기 계산 결과는 "+result+"입니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        multi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = num1.getText().toString();
                input2 = num2.getText().toString();
                if (input1.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                    num1.requestFocus();
                }
                else if(input2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                    num2.requestFocus();
                }
                else{
                    int result = Integer.parseInt(input1)*Integer.parseInt(input2);
                    Toast.makeText(getApplicationContext(),"곱하기 계산 결과는 "+result+"입니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        divd_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = num1.getText().toString();
                input2 = num2.getText().toString();
                if (input1.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                    num1.requestFocus();
                }
                else if(input2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",
                            Toast.LENGTH_SHORT).show();
                    num2.requestFocus();
                }
                else{
                    double p = Double.parseDouble(input1)/Double.parseDouble(input2);
                    int result = (int) p;
                    Toast.makeText(getApplicationContext(),"나누기 계산 결과는 "+result+"입니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    void init(){

        num1 = (EditText)findViewById(R.id.input_num1);
        num2 = (EditText)findViewById(R.id.input_num2);
        plus_btn = (Button)findViewById(R.id.plus);
        minus_btn = (Button)findViewById(R.id.minus);
        multi_btn = (Button)findViewById(R.id.multi);
        divd_btn = (Button)findViewById(R.id.divide);
    }
}
