package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE_USERNAME = "com.example.myapplication.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view){
            Intent intent = new Intent(this, MainActivity2.class);
            EditText editText = (EditText)findViewById(R.id.EditTextLogin);
            String message = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE_USERNAME, message);
            startActivity(intent);
    }
}