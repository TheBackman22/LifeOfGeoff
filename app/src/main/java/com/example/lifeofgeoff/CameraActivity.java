package com.example.lifeofgeoff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        System.out.println("We in da camera");

        ImageButton flip = findViewById(R.id.flipButton);
        View.OnClickListener toCamClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0; i < 10; i++) {
                    String s = "";
                    for(int j = 0; j < 10; j++) {
                        s += ("\\|/" + "\t");
                    }
                    s += i;
                    System.out.println(s);
                }
            }
        };
        flip.setOnClickListener(toCamClick);
    }
}
