package com.shahin.eclasseroom;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.shahin.ecollegeroom.R;

public class SettingsActivity extends AppCompatActivity {

    ListView lst;
    String name[] = {"About Classroom App", "Rate Me", "Refer Classroom App To Your Friend", "Email Your Feedback", "Report a bug"};
    String num[] = {"Version 1.0", "Application", "Share this app with friends", "Tell me your suggestions", "Tell me if you found any problem"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        lst = findViewById(R.id.listView);
        CustomAdapterSetting adapter = new CustomAdapterSetting(this, name, num);
        lst.setAdapter(adapter);
    }
}
