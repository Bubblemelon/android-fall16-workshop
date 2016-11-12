package com.example.rfong.testapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String NAME_KEY = "com.example.mainactivity.name";

    public EditText etName;
    public Button btnEnter;
    public Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        etName = (EditText) findViewById(R.id.etname);
        btnEnter = (Button) findViewById(R.id.btnenter);

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, DisplayActivity.class);
                intent.putExtra(NAME_KEY, etName.getText().toString());
                startActivity(intent);
            }
        });
    }
}
