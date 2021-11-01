package com.acg.apnasiddharthnagar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       img = findViewById(R.id.detailcatimg);
      textView = findViewById(R.id.detailcattxt);

        img.setImageResource(getIntent().getIntExtra("image",0));
//        textView.setText(getIntent().getStringExtra("header"));
textView.setText(getIntent().getStringExtra("fulldetail"));

      
    }
}