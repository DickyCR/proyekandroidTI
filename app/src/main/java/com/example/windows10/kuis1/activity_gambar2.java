package com.example.windows10.kuis1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_gambar2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar2);
    }

    public void back(View view) {
        Intent intent = new Intent(activity_gambar2.this, activity_gambar.class); //methode apabila tombol di klik menuju layout gambar
        startActivity(intent);
    }

}