package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class ShowActivity extends AppCompatActivity {

    private TextView cityText;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        // connect layout items
        cityText = findViewById(R.id.city_name);
        backButton = findViewById(R.id.button_back);

        // get city name from Intent
        Intent intent = getIntent();
        String cityName = intent.getStringExtra("cityName");
        cityText.setText(cityName);

        // set back button listener
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();  // return to MainActivity
            }
        });
    }
}
