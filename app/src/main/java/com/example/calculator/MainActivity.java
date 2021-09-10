package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_plus;
    Button btn_minus;
    Button btn_div;
    Button btn_mul;
    Button btn_result;
    TextView tv_insert;
    String insert_num = null;
    Stack <String> infix_stack = new Stack<>();
    Stack <String> postfix_stack = new Stack<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_div = findViewById(R.id.btn_div);
        btn_mul = findViewById(R.id.btn_mul);
        btn_result = findViewById(R.id.btn_result);
        tv_insert = findViewById(R.id.tv_insert);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(insert_num == null){
                    insert_num = "1";
                    tv_insert.setText(insert_num);
                }
                else
                    insert_num = insert_num + "1";tv_insert.setText(insert_num);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(insert_num == null){
                    insert_num = "2";
                    tv_insert.setText(insert_num);
                }
                else
                    insert_num = insert_num + "2";tv_insert.setText(insert_num);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(insert_num == null){
                    insert_num = "3";
                    tv_insert.setText(insert_num);
                }
                else
                    insert_num = insert_num + "3";tv_insert.setText(insert_num);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(insert_num == null){
                    insert_num = "4";
                    tv_insert.setText(insert_num);
                }
                else
                    insert_num = insert_num + "4";tv_insert.setText(insert_num);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(insert_num == null){
                    insert_num = "5";
                    tv_insert.setText(insert_num);
                }
                else
                    insert_num = insert_num + "5";tv_insert.setText(insert_num);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(insert_num == null){
                    insert_num = "6";
                    tv_insert.setText(insert_num);
                }
                else
                    insert_num = insert_num + "6";tv_insert.setText(insert_num);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(insert_num == null){
                    insert_num = "7";
                    tv_insert.setText(insert_num);
                }
                else
                    insert_num = insert_num + "7";tv_insert.setText(insert_num);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(insert_num == null){
                    insert_num = "8";
                    tv_insert.setText(insert_num);
                }
                else
                    insert_num = insert_num + "8";tv_insert.setText(insert_num);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(insert_num == null){
                    insert_num = "9";
                    tv_insert.setText(insert_num);
                }
                else
                    insert_num = insert_num + "9";tv_insert.setText(insert_num);
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infix_stack.push(tv_insert.getText().toString());
                infix_stack.push("+");
                tv_insert.setText(null);
                insert_num = null;
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infix_stack.push(tv_insert.getText().toString());
                infix_stack.push("+");
                tv_insert.setText(null);
                insert_num = null;
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infix_stack.push(tv_insert.getText().toString());
                infix_stack.push("-");
                tv_insert.setText(null);
                insert_num = null;
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infix_stack.push(tv_insert.getText().toString());
                infix_stack.push("/");
                tv_insert.setText(null);
                insert_num = null;
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infix_stack.push(tv_insert.getText().toString());
                infix_stack.push("*");
                tv_insert.setText(null);
                insert_num = null;
            }
        });

    }
}