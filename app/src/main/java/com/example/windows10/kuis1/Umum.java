package com.example.windows10.kuis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Umum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umum);
    }

    public void back(View view) { //methode untuk inisiasi tombol apabila di klik akan menuju layout fasilitas wisata
        Intent intent = new Intent(Umum.this, FasilitasWisata.class);
        startActivity(intent);
    }
}
