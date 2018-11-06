package com.mrlhood.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private final int WHOLE_NOTE = 1000;
    private Button Anote;
    private Button Bnote;
    private Button BBnote;
    private Button Cnote;
    private Button CSnote;
    private Button Dnote;
    private Button Dsharp;
    private Button Enote;
    private Button Fnote;
    private Button Fsharp;






    private MediaPlayer scaleA;
    private MediaPlayer scaleB;
    private MediaPlayer scaleBB;
    private MediaPlayer scalec;
    private MediaPlayer scalecs;
    private MediaPlayer scaled;
    private MediaPlayer scaleds;
    private MediaPlayer scalef;
    private MediaPlayer scalee;
    private MediaPlayer scalefs;
    private MediaPlayer notes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        initializeMediaPlayers();
    }

    private void initializeMediaPlayers() {
        scaleA = MediaPlayer.create(this,R.raw.scalea);
        scaleB = MediaPlayer.create(this,R.raw.scaleb);
        scaleBB = MediaPlayer.create(this,R.raw.scalebb);
        scalec = MediaPlayer.create(this,R.raw.scalec);
        scalecs = MediaPlayer.create(this,R.raw.scalecs);
        scaled = MediaPlayer.create(this,R.raw.scaled);
        scaleds = MediaPlayer.create(this,R.raw.scaleds);
        scalee = MediaPlayer.create(this,R.raw.scalee);
        scalef = MediaPlayer.create(this,R.raw.scalef);
        scalefs =MediaPlayer.create(this,R.raw.scalefs);

    }

    private void setListeners () {
        Anote.setOnClickListener(this);
        Bnote.setOnClickListener(this);
        BBnote.setOnClickListener(this);
        Cnote.setOnClickListener(this);
        CSnote.setOnClickListener(this);
        Dnote.setOnClickListener(this);
        Dsharp.setOnClickListener(this);
        Enote.setOnClickListener(this);
        Fnote.setOnClickListener(this);
        Fsharp.setOnClickListener(this);
         }

    private void wireWidgets() {
        Anote = (Button) findViewById(R.id.button);
        Bnote = (Button) findViewById(R.id.button2);
        BBnote = (Button) findViewById(R.id.button3);
        Cnote = (Button) findViewById(R.id.button4);
        CSnote = (Button) findViewById(R.id.button5);
        Dnote = (Button) findViewById(R.id.button6);
        Dsharp = (Button) findViewById(R.id.button7);
        Enote = (Button) findViewById(R.id.button8);
        Fnote = (Button) findViewById(R.id.button9);
        Fsharp = (Button) findViewById(R.id.button10);

    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");

                    }



    @Override
    public void  onClick (View v) {
        int id = v.getId();
        if(id == R.id.button)
        {
            scaleA.seekTo(0);
            scaleA.start();
        }
        else if(id==R.id.button2){
            scaleB.seekTo(0);
            scaleB.start();
        }
        else if(id==R.id.button3){
            scaleBB.seekTo(0);
            scaleBB.start();
        }
        else if(id==R.id.button4){
            scalec.seekTo(0);
            scalec.start();
        }
        else if(id==R.id.button5){
            scalecs.seekTo(0);
            scalecs.start();
        }
        else if(id==R.id.button6){
            scaled.seekTo(0);
            scaled.start();
        }
        else if(id==R.id.button7){
            scaleds.seekTo(0);
            scaleds.start();
        }
        else if(id==R.id.button8){
            scalee.seekTo(0);
            scalee.start();
        }
        else if(id==R.id.button9){
            scalef.seekTo(0);
            scalef.start();
        }
        else if(id==R.id.button10){
            scalefs.seekTo(0);
            scalefs.start();
        }
    }
}