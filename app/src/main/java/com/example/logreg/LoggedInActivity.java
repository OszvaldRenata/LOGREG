package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

public class LoggedInActivity extends AppCompatActivity {

    public Button kijelentkezes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        init();
        kijelentkezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kijelentkezes = new Intent(LoggedInActivity.this, MainActivity.class);
                startActivity(kijelentkezes);
                finish();
            }
        });
    }

    private void init() {
        kijelentkezes = findViewById(R.id.btn_kijelentkez);
    }
}