package com.example.bregasaria.bregasariawicaksana_1202150052_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Membuat objek pada class
    Button list,pencarigambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mereference objek yang telah dideklarasikan
        list = findViewById(R.id.listmahasiswa);
        pencarigambar = findViewById(R.id.carigambar);


        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,NamaMahasiswa.class);
                startActivity(a);
            }
        });

        pencarigambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this,PencarianGambar.class);
                startActivity(b);
            }
        });
    }
}