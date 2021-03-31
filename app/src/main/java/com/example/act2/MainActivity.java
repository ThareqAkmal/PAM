package com.example.act2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnlogin;
    EditText edemil, edpass;

    String nama, password;


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.mnDaftar){
            Intent inten = new Intent(getApplicationContext(), daftarActivity.class);
            startActivity(inten);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

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

                String email = "admin@mail.com";

                String pass = "123";

                if(nama.isEmpty() || password.isEmpty()) {

                    Toast t = Toast.makeText(getApplicationContext(),
                            "mohon isi dulu bro email sama passwordnya!", Toast.LENGTH_LONG);

                    t.show();
                }else {

                    if(nama.equals(email) && (password.equals(pass))) {
                        Toast t = Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG);

                        t.show();

                        Bundle bandel = new Bundle();

                        bandel.putString("a", nama.trim());

                        bandel.putString("b", password.trim());

                        Intent inten = new Intent(getApplicationContext(), Home_Activity.class);

                        inten.putExtras(bandel);

                        startActivity(inten);
                    }else{

                        Toast t = Toast.makeText(getApplicationContext(), "Login Gagal", Toast.LENGTH_LONG);

                        t.show();
                    }
                }
            }
        });
    }
}