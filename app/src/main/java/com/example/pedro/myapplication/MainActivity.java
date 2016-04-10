package com.example.pedro.myapplication;


import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View btnFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFacebook = (View) findViewById(R.id.btnFacebook);
        btnFacebook.setOnClickListener(this);


    }

    public void onClick(View v){
        Intent intent = new Intent(MainActivity.this, ActivityCards.class);
        startActivity(intent);


    }
}
