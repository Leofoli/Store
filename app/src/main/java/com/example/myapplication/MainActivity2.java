package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    public final static String EXTRA_MESSAGE_NOME_CAMISA = "com.example.myapplication.MESSAGE";
    public final static String EXTRA_MESSAGE_DESC_CAMISA = "com.example.myapplication.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_USERNAME);
        TextView textView = (TextView)findViewById(R.id.txtNome);
        textView.setTextSize(20);
        textView.setText(message);
    }
    public void Comprar(View view){
        Intent intent = new Intent(this, MainActivity3.class);
        TextView textView1 = (TextView)findViewById(R.id.txtNomeCamisa);
        TextView textView2 = (TextView)findViewById(R.id.txtdesc);
        String message1 = textView1.getText().toString();
        String message2 = textView2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_NOME_CAMISA, message1);
        intent.putExtra(EXTRA_MESSAGE_DESC_CAMISA, message2);
        startActivity(intent);
    }
}