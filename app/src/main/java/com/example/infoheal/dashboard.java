package com.example.infoheal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Attach click listeners to all the buttons
        Button iniciar = findViewById(R.id.iniciar);
        iniciar.setOnClickListener(this);
        Button dashboard = findViewById(R.id.dashboard);
        dashboard.setOnClickListener(this);
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);
        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(this);
        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Determine which button was clicked and redirect to the corresponding page
        if (v.getId() == R.id.iniciar) {
            startActivity(new Intent(this, MainActivity.class));
        } else if (v.getId() == R.id.button1) {
            startActivity(new Intent(this, page1.class));
        } else if (v.getId() == R.id.button2) {
            startActivity(new Intent(this, page2.class));
        } else if (v.getId() == R.id.button3) {
            startActivity(new Intent(this, page3.class));
        } else if (v.getId() == R.id.button4) {
            startActivity(new Intent(this, page4.class));
        } else if (v.getId() == R.id.button5) {
            startActivity(new Intent(this, page5.class));
        } else if (v.getId() == R.id.button6) {
            startActivity(new Intent(this, page6.class));
        } else if (v.getId() == R.id.button7) {
            startActivity(new Intent(this, page7.class));
        } else if (v.getId() == R.id.button8) {
            startActivity(new Intent(this, page8.class));
        } else if (v.getId() == R.id.button9) {
            startActivity(new Intent(this, page9.class));
        }
    }
}