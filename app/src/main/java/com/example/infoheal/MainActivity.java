package com.example.infoheal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Attach click listeners to all the buttons
        Button iniciar = findViewById(R.id.iniciar);
        iniciar.setOnClickListener(this);
        Button dashboard = findViewById(R.id.dashboard);
        dashboard.setOnClickListener(this);
    }
    @Override
    public void onBackPressed () {
    }

        @Override
    public void onClick(View v) {
        // Determine which button was clicked and redirect to the corresponding page
        if (v.getId() == R.id.dashboard) {
            startActivity(new Intent(this, dashboard.class));
        }
    }
}