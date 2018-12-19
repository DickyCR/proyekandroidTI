package com.example.windows10.kuis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpiniActivity extends AppCompatActivity {
    private Button opini;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opini);

        opini = (Button) findViewById(R.id.btn_home);
        opini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //methode untuk menginisiasi apabila di klik akan pindah pada layout home
                Intent i = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(i);
            }
        });
    }
}
