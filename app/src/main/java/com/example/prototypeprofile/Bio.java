package com.example.prototypeprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Bio extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

    }
    public void bioUpdate(View view) {
        EditText simpleEditText = (EditText) findViewById(R.id.editTextBio);
        String strValue = simpleEditText.getText().toString();

        Intent intent = new Intent(Bio.this, MainActivity.class);
        intent.putExtra("bioKey",strValue);
        startActivity(intent);


    }

}