package com.example.prototypeprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Picture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
    }
    public void pictureUpdate(View view) {

        //EditText simpleEditText = (EditText) findViewById(R.id.imageButton2);
        //String strValue = simpleEditText.getText().toString();

        Intent intent = new Intent(Picture.this, MainActivity.class);
        //intent.putExtra("key",strValue);
        startActivity(intent);
    }
}