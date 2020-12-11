package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private Button regiszt;
    private EditText email;
    private EditText felhasznalonev;
    private EditText jelszocska;
    private EditText teljesnevecske;
    private  Button visszalep;
    private Boolean kivan_e_toltve;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
        if (kivan_e_toltve = false)
        {
            regiszt.setEnabled(false);
        }


        visszalep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vissza1 = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(vissza1);
                finish();
            }
        });
        regiszt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String email1 = email.getText().toString();
            String felhasznalonev1 = felhasznalonev.getText().toString();
            String jelszoo = jelszocska.getText().toString();
            String teljesneve = teljesnevecske.getText().toString();


            if (email1.isEmpty())
            {
                kivan_e_toltve = false;
                Toast.makeText(RegisterActivity.this, "Írd be az e-mail címed!", Toast.LENGTH_SHORT).show();
            }
            if (email1.contains("@") && email1.contains("."))
            {
                kivan_e_toltve = false;
                int kukachelye = email1.lastIndexOf("@");
                int ponthelye = email1.lastIndexOf(".");
                if (!(kukachelye < ponthelye))
                {
                    Toast.makeText(RegisterActivity.this, "Helytelen email cím!", Toast.LENGTH_SHORT).show();
                }
            }
            if (felhasznalonev1.isEmpty())
            {
                kivan_e_toltve = false;
                Toast.makeText(RegisterActivity.this, "Írj be egy felhasználónevet!", Toast.LENGTH_SHORT).show();
            }
            if (jelszoo.isEmpty())
            {
                kivan_e_toltve = false;
                Toast.makeText(RegisterActivity.this, "Írjon be egy jelszavat!", Toast.LENGTH_SHORT).show();
            }
            if (teljesneve.isEmpty())
            {
                kivan_e_toltve = false;
                Toast.makeText(RegisterActivity.this, "Írja be a teljes nevét!", Toast.LENGTH_SHORT).show();
            }
            else {regiszt.setEnabled(true);}



            return;


            }

        });

    }

    private void init() {
        regiszt = findViewById(R.id.btn_regreg);
        visszalep = findViewById(R.id.btn_vissza);
    }
}