package com.example.act2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {

    TextView tvEmil, tvpasw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        tvEmil = findViewById(R.id.txemail);

        tvpasw = findViewById(R.id.txpasw);

        Bundle bandel = getIntent().getExtras();

        String email = bandel.getString("a");

        String pass = bandel.getString("b");

        tvEmil.setText(email);

        tvpasw.setText(pass);
    }
}