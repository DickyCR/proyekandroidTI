package com.example.windows10.kuis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Zona extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zona);
    }


    public void back(View view) { //methode untuk inisiasi tombol apabila di klik akan kembali menuju layout fasilitas wisata

        Intent intent = new Intent(Zona.this, FasilitasWisata.class);
        startActivity(intent);
    }
}
