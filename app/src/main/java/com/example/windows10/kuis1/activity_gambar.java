package com.example.windows10.kuis1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class activity_gambar extends AppCompatActivity {
    private Button home; //membuat variable buttton home

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar); //inisiasi tombol lewat id

        home = (Button)findViewById(R.id.button_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),HomeActivity.class); //methode apabila tombol di klik menuju home
                startActivity(i);
            }
        });
    }

    public void next(View view) {
        Intent intent = new Intent(activity_gambar.this, activity_gambar2.class); //methode apabila tombol di klik menuju layout gambar 2
        startActivity(intent);
    }
}
