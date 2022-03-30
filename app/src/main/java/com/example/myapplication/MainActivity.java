package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
        EditText email, tendangnhap, matkhau, laimatkhau;
        Button dangky;
        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            email=findViewById(R.id.email);
            tendangnhap=findViewById(R.id.tendangnhap);
            matkhau=findViewById(R.id.matkhau);
            laimatkhau=findViewById(R.id.laimatkhau);
            email=findViewById(R.id.email);
            dangky=findViewById(R.id.dangky);

            dangky.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
}
