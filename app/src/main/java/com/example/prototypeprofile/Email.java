package com.example.prototypeprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }
    public void emailUpdate(View view) {
        EditText simpleEditText = (EditText) findViewById(R.id.editTextTextEmailAddress);
        String strValue = simpleEditText.getText().toString();

        Intent intent = new Intent(Email.this, MainActivity.class);
        intent.putExtra("emailKey",strValue);
        startActivity(intent);
    }
}