package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find text View that shows list of numbers
        TextView numbersList = findViewById(R.id.numbers);
        // Set clickListener on the View
        numbersList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersListIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersListIntent);
            }
        });

        // Find text View that shows family category
        TextView family = findViewById(R.id.family);
        // Set clickListener on the View
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // Find text View that shows colors category
        TextView colors = findViewById(R.id.colors);
        // Set clickListener on the View
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });


        // Find text View that shows phrases category
        TextView phrases = findViewById(R.id.phrases);
        // Set clickListener on the View
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }
}
