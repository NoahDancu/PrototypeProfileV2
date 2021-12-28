package com.example.prototypeprofile;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle extras = getIntent().getExtras();

        //String value = extras.getString("key");
        if (extras != null) {
            if(extras.equals("bioKey")){
                String value = extras.getString("bioKey");

                ((Button) findViewById(R.id.Bio_button)).setText(value);
            }else
            if(extras.equals("emailKey")){
                String value = extras.getString("emailKey");

                ((Button) findViewById(R.id.Email_button)).setText(value);
            }else
            if(extras.equals("phoneKey")){
                String value = extras.getString("phoneKey");

                ((Button) findViewById(R.id.Phone_button)).setText(value);
            }else
            if(extras.equals("nameKey")){
                String value = extras.getString("nameKey");

                ((Button) findViewById(R.id.Name_button)).setText(value);
            }
            //String value = extras.getString("key");
        }
    }

    public void name(View view) {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("nameKey");

            ((Button) findViewById(R.id.Name_button)).setText(value);
        }
        Intent intent = new Intent(MainActivity.this, UserInfo.class);
        startActivity(intent);
    }
    public void phone(View view) {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("phoneKey");

            ((Button) findViewById(R.id.Phone_button)).setText(value);
        }
        Intent intent = new Intent(MainActivity.this, phone_info.class);
        startActivity(intent);
    }
    public void picture(View view) {
        Bundle extras = getIntent().getExtras();

        Intent intent = new Intent(MainActivity.this, Picture.class);
        startActivity(intent);
    }
    public void email(View view) {

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("emailKey");

            ((Button) findViewById(R.id.Email_button)).setText(value);
        }
        Intent intent = new Intent(MainActivity.this, Email.class);
        startActivity(intent);

    }
    public void bio(View view) {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("bioKey");

            ((Button) findViewById(R.id.Bio_button)).setText(value);
        }
        Intent intent = new Intent(MainActivity.this, Bio.class);
        startActivity(intent);
    }
    public void bioCick(View view) {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("bioKey");

            ((Button) findViewById(R.id.Bio_button)).setText(value);
        }
    }
}