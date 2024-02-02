package com.example.animationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        overridePendingTransition(R.anim.slight_in_right,R.anim.slight_in_left);
        Button btnBack=findViewById(R.id.btnBackToScreen);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}