package com.example.act2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private ListView list;

    EditText sercing;

    private ListViewAdapter adapter;

    String[] listNama;

    public static ArrayList<ClassNama> classNamaArrayList = new ArrayList<ClassNama>();

    Bundle bandel = new Bundle();

    Intent inten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        listNama = new String[]{"Akmal", "Yudais", "Damo", "Alif", "Kidoel",
                "Bagus", "Adiet", "Fariz", "Nizar", "Ghozi"};

        list = findViewById(R.id.listkontak);
        sercing = findViewById(R.id.Edsearch);

        classNamaArrayList = new ArrayList<>();

        for(int i = 0; i <listNama.length; i++){
            ClassNama classNama = new ClassNama(listNama[i]);

            classNamaArrayList.add(classNama);
        }

        adapter = new ListViewAdapter(this);

        list.setAdapter(adapter);

        sercing.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Home_Activity.this.adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nama = classNamaArrayList.get(position).getName();

                bandel.putString("a", nama.trim());

                PopupMenu pm = new PopupMenu(getApplicationContext(), view);

                pm.setOnMenuItemClickListener(Home_Activity.this);

                pm.inflate(R.menu.popup_menu);

                pm.show();
            }
        });


    }


    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.mnview:
                inten = new Intent(getApplicationContext(),ActivityLihatData.class);
                inten.putExtras(bandel);
                startActivity(inten);
                break;
            case R.id.mnedit:
                Toast.makeText(getApplicationContext(),"Ini untuk edit kontak",
                        Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}