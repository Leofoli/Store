package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

public class MainActivity3 extends AppCompatActivity {
    public final static String EXTRA_MESSAGE_PRECO = "com.example.myapplication.MESSAGE";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        String nomeCamisa = intent.getStringExtra(MainActivity2.EXTRA_MESSAGE_NOME_CAMISA);
        String descCamisa = intent.getStringExtra(MainActivity2.EXTRA_MESSAGE_DESC_CAMISA);
        TextView textViewNome = (TextView)findViewById(R.id.txtNomeCamisa);
        TextView textViewDesc = (TextView)findViewById(R.id.txtDescCamisa);
        textViewDesc.setTextSize(20);
        textViewNome.setTextSize(20);
        textViewDesc.setText(descCamisa);
        textViewNome.setText(nomeCamisa);
    }
    public void Comprar(View view){
        Intent intent = new Intent(this, MainActivity4.class);
        TextView textView = (TextView)findViewById(R.id.txtpreco);
        String message = textView.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_PRECO, message);
        startActivity(intent);
    }

}