package com.example.prototypeprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class phone_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_info);
    }
    public void phoneUpdate(View view) {
        EditText simpleEditText = (EditText) findViewById(R.id.editTextPhone);
        String strValue = simpleEditText.getText().toString();

        Intent intent = new Intent(phone_info.this, MainActivity.class);
        intent.putExtra("phoneKey",strValue);
        startActivity(intent);
    }
}