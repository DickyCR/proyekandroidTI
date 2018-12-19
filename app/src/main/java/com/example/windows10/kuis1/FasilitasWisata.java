package com.example.windows10.kuis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FasilitasWisata extends AppCompatActivity {
    private Button umum;
    private Button utama;
    private Button wahana; //membuat variable button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas_wisata);

        umum = (Button) findViewById(R.id.umum); //methode apabila tombol di klik menuju layout umum
            umum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Umum.class);
                startActivity(i);
            }
        });

        utama = (Button) findViewById(R.id.utama); //methode apabila tombol di klik menuju layout Hall utama
            utama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),HallUtama.class);
                startActivity(i);
            }
        });

        wahana = (Button) findViewById(R.id.wahanaZona); //methode apabila tombol di klik menuju layout zona
            wahana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Zona.class);
                startActivity(i);
            }
        });
    }

    public void home(View view) {
        Intent intent = new Intent(FasilitasWisata.this, HomeActivity.class);
        startActivity(intent);
    }
}
