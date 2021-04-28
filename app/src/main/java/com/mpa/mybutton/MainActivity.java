package com.mpa.mybutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.id_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.id_layout_bg);
                int colorBg = bgElement.getSolidColor();
                if( colorBg == Color.BLUE){
                    bgElement.setBackgroundColor(Color.BLUE);
                }else {
                    Random random = new Random();
                    int val = random.nextInt();
                    String hex = new String();
                    hex = Integer.toHexString(val).substring(0,6);
                    bgElement.setBackgroundColor(Color.parseColor("#"+hex.toUpperCase()));


                }
            }
        });
    }
}