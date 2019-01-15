package com.hly.lambda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =findViewById(R.id.btn);
        btn1 = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "原始的写法", Toast.LENGTH_SHORT).show();
            }
        });

        btn1.setOnClickListener(View ->{
            Toast.makeText(this, "lambda表达式", Toast.LENGTH_SHORT).show();
        });

        Thread td = new Thread(new Runnable() {
            @Override
            public void run() {
                ///
            }
        });
        td.start();

        Thread td1 = new Thread(() -> {
            ///
        });
        td1.start();
    }
}
