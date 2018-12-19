package com.example.windows10.kuis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_deskripsi extends AppCompatActivity {
    private Button home; //membuat variable Button home
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        home = (Button) findViewById(R.id.kembali); //inisiasi button home
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),HomeActivity.class); //metode untuk menuju layout lanjutan bila di klik
                startActivity(i);
            }
        });
    }
}
