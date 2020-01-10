package com.example.fragmentbasicapplication1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main5Activity extends AppCompatActivity {
    ToggleButton btn1, btn2;
    Button b1;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        btn1 = findViewById(R.id.toggleButton1);
        btn2 = findViewById(R.id.toggleButton2);
        b1=findViewById(R.id.submit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String status;
                status="Mood"+btn1.getText()+"Choice"+btn2.getText();
                Toast.makeText(getApplicationContext(),status,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
