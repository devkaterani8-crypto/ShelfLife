package com.example.shelflife;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // simple text placeholder
        TextView textView = new TextView(this);
        textView.setText("Welcome to SelfLife 🌿");
        textView.setTextSize(22f);
        textView.setPadding(40, 40, 40, 40);

        setContentView(textView);
    }
}
