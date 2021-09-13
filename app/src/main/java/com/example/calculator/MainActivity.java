package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Button btn_0;
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
    Button btn_clear;
    TextView tv_insert;
    String insert_num = null;
    String insert_arr[] = new String[20];
    String postfix_arr[] = new String[20];

    Stack <String> infix_stack = new Stack<>();
    Stack <String> postfix_stack = new Stack<>();
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = findViewById(R.id.btn_0);
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
        btn_clear = findViewById(R.id.btn_clear);
        tv_insert = findViewById(R.id.tv_insert);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(insert_num == null){
                    insert_num = "0";
                    tv_insert.setText(insert_num);
                }
                else
                    insert_num = insert_num + "0";tv_insert.setText(insert_num);
            }
        });

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
                insert_arr[count++] = tv_insert.getText().toString();
                insert_arr[count++] = "+";
                tv_insert.setText(null);
                insert_num = null;
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert_arr[count++] = tv_insert.getText().toString();
                insert_arr[count++] = "-";
                tv_insert.setText(null);
                insert_num = null;
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert_arr[count++] = tv_insert.getText().toString();
                insert_arr[count++] = "/";
                tv_insert.setText(null);
                insert_num = null;
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert_arr[count++] = tv_insert.getText().toString();
                insert_arr[count++] = "*";
                tv_insert.setText(null);
                insert_num = null;
            }
        });

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count == 0){
                    Toast.makeText(getApplicationContext(), "입력값이 비었습니다", Toast.LENGTH_SHORT).show();
                }

                else{
                    insert_arr[count] = tv_insert.getText().toString();

                    for(int i = 0 ; i<insert_arr.length; i++){
                        if(insert_arr[i] == null && insert_arr[i-1]!=null){
                            postfix_stack.push(infix_stack.pop());
                            break;
                        }
                        else{
                            int priority = prec(insert_arr[i]);
                            switch (insert_arr[i]){
                                case "+" :
                                case "-" :
                                case "*" :
                                case "/" :
                                    while(!infix_stack.isEmpty() && prec(infix_stack.peek()) <= priority){
                                        postfix_stack.push(infix_stack.pop());
                                    }
                                    infix_stack.push(insert_arr[i]);
                                    break;
                                default:
                                    postfix_stack.push(insert_arr[i]);

                            }


                        }
                    }

                    //후위표현식 계산
                    int size = postfix_stack.size();

                    for(int i = 0 ; i<postfix_arr.length; i++){
                        if(postfix_stack.empty())
                            break;
                        else
                        postfix_arr[i] = postfix_stack.pop();
                    };

                    int a=0, b = 0;

                    for(int i = size-1 ; i>=0; i--){
                        if(postfix_arr[i] != "+" && postfix_arr[i] != "-" && postfix_arr[i] != "*" && postfix_arr[i] != "/"){
                            postfix_stack.push(postfix_arr[i]);
                        }
                        else{
                            b = Integer.parseInt(postfix_stack.pop());
                            a = Integer.parseInt(postfix_stack.pop());

                            switch (postfix_arr[i]){
                                case "+":
                                    postfix_stack.push(Integer.toString(a+b));
                                    break;
                                case "-":
                                    postfix_stack.push(Integer.toString(a-b));
                                    break;
                                case "*":
                                    postfix_stack.push(Integer.toString(a*b));
                                    break;
                                case "/":
                                    postfix_stack.push(Integer.toString(a/b));
                                    break;
                            }

                        }
                    }

                    tv_insert.setText(postfix_stack.pop());

                }



            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert_num = null;
                tv_insert.setText(null);
                infix_stack.clear();
                postfix_stack.clear();
                count=0;
                for(int i = 0 ; i<insert_arr.length; i++){
                    insert_arr[i] = null;
                    postfix_arr[i] = null;
                }

            }
        });

    }

    int prec(String s){
        switch(s){
            case "+":
            case "-" :
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return 0;

        }
    }
}