package com.example.lifeofgeoff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.lifeWithGeoff);
        View.OnClickListener j = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
        b.setOnClickListener(j);
    }
}
