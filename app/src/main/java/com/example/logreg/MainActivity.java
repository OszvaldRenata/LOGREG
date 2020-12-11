package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private  Button bejelentkezes;
    private Button reg;
    private EditText felhaszn;
    private EditText jelszo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        bejelentkezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String felhasznalonev = felhaszn.getText().toString();
                String jelszo1 = jelszo.getText().toString();

                if (felhasznalonev.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Írja be a felhasználónevét!", Toast.LENGTH_SHORT).show();
                }
                if (jelszo1.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Írja be a jelszavát!", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(reg);
                finish();
            }
        });


    }

    private void init() {
        reg = findViewById(R.id.btn_reg);
        bejelentkezes = findViewById(R.id.btn_bejel);
        felhaszn = findViewById(R.id.text_felhaszn);
        jelszo = findViewById(R.id.text_jelszo);
    }
}
