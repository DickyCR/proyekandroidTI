package com.example.windows10.kuis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HallUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hall_utama);
    }

    public void back(View view) {
        Intent intent = new Intent(HallUtama.this, FasilitasWisata.class); //methode apabila tombol di klik akan kembali
        startActivity(intent);
    }
}
