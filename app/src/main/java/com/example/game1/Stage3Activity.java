package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Stage3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage3);
        ImageButton image4;
        image4=(ImageButton)findViewById(R.id.img4);

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent st3=new Intent(getBaseContext(),Stage2Activity.class);
                startActivity(st3);
            }
        });

    }
}