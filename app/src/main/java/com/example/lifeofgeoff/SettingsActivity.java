package com.example.lifeofgeoff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Switch singular = findViewById(R.id.switch1);
        Switch capturable = findViewById(R.id.switch2);
        Switch recordable = findViewById(R.id.switch3);
        Switch faceCounterActive = findViewById(R.id.switch4);
        Switch lifeWithJoff = findViewById(R.id.switch5);
        Button uploadButton = findViewById(R.id.button2);
        Button toCameraScreen = findViewById(R.id.toCamera);
        final Intent i = new Intent(this, CameraActivity.class);
        singular.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                i.putExtra("singlePerson", isChecked);
                System.out.println("singular state = " + isChecked);
            }
        });
        capturable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                System.out.println("capture state = " + isChecked);
            }
        });
        recordable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                System.out.println("record state = " + isChecked);
            }
        });
        faceCounterActive.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                System.out.println("count state = " + isChecked);
            }
        });
        lifeWithJoff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                System.out.println("geoff state = " + isChecked);
            }
        });
        View.OnClickListener upload = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("He tried to upload and image but he can't yet haha");
            }
        };
        uploadButton.setOnClickListener(upload);

        View.OnClickListener toCamClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        };
        toCameraScreen.setOnClickListener(toCamClick);
    }
}
