package com.shahin.eclasseroom;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.shahin.ecollegeroom.R;

public class LecturesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectures);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}
