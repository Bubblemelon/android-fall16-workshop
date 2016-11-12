package com.example.rfong.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    public TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvName = (TextView) findViewById(R.id.tvhello);

        String name =  this.getIntent().getStringExtra(MainActivity.NAME_KEY);

        tvName.setText("Hello " + name);

    }
}
