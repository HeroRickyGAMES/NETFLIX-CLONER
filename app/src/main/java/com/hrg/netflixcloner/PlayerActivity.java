package com.hrg.netflixcloner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //Esconde a StatusBar
        View decorVideo = getWindow().getDecorView();
        int uiOpcoes = View.SYSTEM_UI_FLAG_FULLSCREEN
                |
                videoView.SYSTEM_UI_FLAG_HIDE_NAVIGATION;

        decorVideo.setSystemUiVisibility( uiOpcoes );

        //Esconde a Actionbar
        getSupportActionBar().hide();

        //id do video.
        videoView = findViewById(R.id.videoView);
        //Controlador da media.
        videoView.setMediaController( new MediaController(this) );
        //local e uri ou no caso name string do video.
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video );
        //start video.
        videoView.start();  
    }
}