package com.hrg.netflixcloner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirvideo(View view){
        //Abrir o player quando aperta o botão Play!
        startActivity( new Intent(this, PlayerActivity.class) );
    }
}