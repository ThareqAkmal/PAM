package com.example.act2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class daftarActivity extends AppCompatActivity {
    EditText edtNama, edtAlamat, edtEmail, edtPass, edtUlPass;
    RadioGroup rdgrup;


    Button Dftr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        rdgrup = findViewById(R.id.rgrup);
        edtNama = findViewById(R.id.edNama);
        edtAlamat = findViewById(R.id.edAlmat);
        edtEmail = findViewById(R.id.edEmail);
        edtPass =  findViewById(R.id.EdPassword);
        edtUlPass = findViewById(R.id.edulpass);

        Dftr = findViewById(R.id.btDaftr);

        final int selectId = rdgrup.getCheckedRadioButtonId();

        Dftr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtNama.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty() ||
                        edtEmail.getText().toString().isEmpty() ||
                        edtPass.getText().toString().isEmpty() ||
                        edtUlPass.getText().toString().isEmpty()
                ){
                    Snackbar.make(view, "Wajib isi seluruh Data boi!", Snackbar.LENGTH_LONG).show();
                }else{
                    if(edtPass.getText().toString().equals(edtUlPass.getText().toString())){
                        Toast.makeText(getApplicationContext(), "Pendaftaran berhasil...", Toast.LENGTH_LONG).show();


                        Intent inten = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(inten);
                    }else{
                        Snackbar.make(view, "Password Harus Sama boii!!", Snackbar.LENGTH_LONG).show();
                    }


                }
            }
        });
    }
}