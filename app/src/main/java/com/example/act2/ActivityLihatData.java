package com.example.act2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvname, tvnotelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvname = findViewById(R.id.tvNama);
        tvnotelp = findViewById(R.id.tvNomerTelp);

        Bundle bandel = getIntent().getExtras();

        String nama = bandel.getString("a");

        switch (nama){
            case "Akmal":
                tvname.setText("Akmal H");
                tvnotelp.setText("081284631212");
                break;
            case "Yudais":
                tvname.setText("Yudais T");
                tvnotelp.setText("081278917261");
                break;
            case "Damo":
                tvname.setText("Damo D");
                tvnotelp.setText("081278162039");
                break;
            case "Alif":
                tvname.setText("Alif A");
                tvnotelp.setText("081215243879");
                break;
            case "Kidoel":
                tvname.setText("Kidoel S");
                tvnotelp.setText("081288162543");
                break;
            case "Bagus":
                tvname.setText("Bagus W");
                tvnotelp.setText("081288191023");
                break;
            case "Adiet":
                tvname.setText("Adiet I");
                tvnotelp.setText("081223196643");
                break;
            case "Fariz":
                tvname.setText("Fariz Z");
                tvnotelp.setText("081244427780");
                break;
            case "Nizar":
                tvname.setText("Nizar M");
                tvnotelp.setText("081200774653");
                break;
            case "Ghozi":
                tvname.setText("Ghozi A");
                tvnotelp.setText("081212309990");
                break;
        }
    }
}