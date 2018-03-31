package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the click listener
        NumberClickListener clickListener = new NumberClickListener();

        // Find text view which shows list of numbers
        TextView numbersTextView = findViewById(R.id.numbers);

        // Set a click listener on the View
        clickListener.onClick(numbersTextView);
    }
}
