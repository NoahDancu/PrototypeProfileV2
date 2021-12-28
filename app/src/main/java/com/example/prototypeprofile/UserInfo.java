package com.example.prototypeprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }
    public void nameUpdate(View view) {

        EditText simpleEditText = (EditText) findViewById(R.id.editTextFirstName + R.id.editTextLastName);
        String strValue = simpleEditText.getText().toString();

        Intent intent = new Intent(UserInfo.this, MainActivity.class);
        intent.putExtra("nameKey",strValue);
        startActivity(intent);
    }
}