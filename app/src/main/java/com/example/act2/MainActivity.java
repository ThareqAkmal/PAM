package com.example.act2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnlogin;
    EditText edemil, edpass;

    String nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin= findViewById(R.id.BtSignin);
        edemil =  findViewById(R.id.EdEmail);
        edpass = findViewById(R.id.EdPassword);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama = edemil.getText().toString();

                password = edpass.getText().toString();

                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: " + nama + " dan password anda: " + password+"", Toast.LENGTH_LONG);

                t.show();
            }
        });
    }
}