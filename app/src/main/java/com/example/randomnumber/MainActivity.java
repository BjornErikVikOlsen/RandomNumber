package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button rollButton = findViewById(R.id.rollButton);
        final TextView resultsTextView = findViewById(R.id.resultsTextView);

        final Random myRandom = new Random();

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultsTextView.setText(String.valueOf(myRandom.nextInt(50)));
            }
        });


    }
}
