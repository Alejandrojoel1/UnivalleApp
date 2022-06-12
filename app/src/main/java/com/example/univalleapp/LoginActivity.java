package com.example.univalleapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.net.URI;

public class LoginActivity extends AppCompatActivity {

    EditText etCuenta,etConstraseña;
    Button btnIngresar;
    ImageButton ibMessenger,ibFacebook;
    ImageView ivFaceid,ivTouchid;
    String url = "https://www.facebook.com/UnivalleBolivia";
    String luka = "https://m.me/HolaLuka?ref=p:6;o:cweb";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etCuenta = findViewById(R.id.etCuenta);
        etConstraseña = findViewById(R.id.etConstraseña);
        btnIngresar = findViewById(R.id.btnIngresar);
        ibMessenger = findViewById(R.id.ibMessenger);
        ibFacebook = findViewById(R.id.ibFacebook);
        ivFaceid = findViewById(R.id.ivFaceid);
        ivTouchid = findViewById(R.id.ivTouchid);

        //Click Facebook
        ibFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri linkface = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW,linkface);
                startActivity(intent);
            }
        });
        //Click Luka
        ibMessenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri linkluka = Uri.parse(luka);
                Intent intent = new Intent(Intent.ACTION_VIEW,linkluka);
                startActivity(intent);
            }
        });

    }
}