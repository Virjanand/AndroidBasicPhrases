package com.virjanand.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void playFrenchTranslation(View view) {

        MediaPlayer
                .create(this, getResources().getIdentifier((String) view.getTag()
                        , "raw", getPackageName()))
                .start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
