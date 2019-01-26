package com.virjanand.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void playFrenchTranslation(View view) {

        String tag = (String) view.getTag();
        playSentence(tag);
    }

    private void playSentence(String tag) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(tag, "raw", getPackageName()));
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
