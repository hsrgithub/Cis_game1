package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Stage2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage2);
        Button bt2;
        ImageButton image3;
        bt2=(Button)findViewById(R.id.s3);
        image3=(ImageButton)findViewById(R.id.img3);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(getBaseContext(),Stage3Activity .class);
                startActivity(intent3);
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s1=new Intent(getBaseContext(),Stage1Activity.class);
                startActivity(s1);
            }
        });


    }
}