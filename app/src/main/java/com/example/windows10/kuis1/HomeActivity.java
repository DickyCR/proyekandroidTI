package com.example.windows10.kuis1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity {
    private Button deskripsi;
    private Button fasilitas;
    private Button gambar;
    private Button opini;

    private Button googlemaps; //membuat variable button

    //Declaration SharedPreferences
    SharedPreferences pref;
    Cursor cursor;
    //Declaration SqliteHelper
    DataHelper dataHelper;

    TextView txtusername;

    //Declaration Button
    Button buttonLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        pref = getSharedPreferences("SharedPref", Context.MODE_PRIVATE);
        String session_id = pref.getString("session", null);

        dataHelper = new DataHelper(this);
        // Query check id user
        SQLiteDatabase db = dataHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT username FROM users WHERE id = '" + session_id + "'", null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            TextView txtusername = (TextView) findViewById(R.id.txtusername);
            txtusername.setText("Selamat Datang, " + cursor.getString(0).toString());
        }

        buttonLogout = (Button) findViewById(R.id.buttonLogout);
        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedpreferences = getSharedPreferences("SharedPref", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.clear();
                editor.commit();
                //User Logged in Successfully Launch You home screen activity
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        deskripsi = (Button) findViewById(R.id.button_deskripsi);
        deskripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),activity_deskripsi.class);
                startActivity(i);
            }
        });

        fasilitas = (Button) findViewById(R.id.button_fasilitas);
        fasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),FasilitasWisata.class);
                startActivity(i);
            }
        });

        gambar = (Button) findViewById(R.id.button_gambar1);
        gambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),activity_gambar.class);
                startActivity(i);
            }
        });

        opini = (Button) findViewById(R.id.button_opini);
        opini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),OpiniActivity.class);
                startActivity(i);
            }
        });

        googlemaps = (Button) findViewById(R.id.button_googlemaps);
        googlemaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                //untuk menentukan titik posisi museum angkut
                i.setData(Uri.parse("https://www.google.com/maps/d/embed?mid=188qVy-DE4Wrniq-gNWU0yZMG6Fo&msa=0&ie=UTF8&t=m&ll=-7.876666474522439%2C112.52154346032717&spn=0.012753%2C0.023561&z=16&output=embed"));
                startActivity(i);

            }
        });


        }
    }


