package com.example.android.musicapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Alex on 07.03.2018.
 */

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button previous;
        Button play;
        Button stop;
        Button next;

        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the nowplaying.xml layout file
        setContentView(R.layout.nowplaying);

        // Find the previous Button
        previous = (Button) findViewById(R.id.previous);

        // Set a click listener on that View
        previous.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });

        // Find the play Button
        play = (Button) findViewById(R.id.play);

        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });

        // Find the stop Button
        stop = (Button) findViewById(R.id.stop);

        // Set a click listener on that View
        stop.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });

        // Find the next Button
        next = (Button) findViewById(R.id.next);

        // Set a click listener on that View
        next.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });

    }

}


