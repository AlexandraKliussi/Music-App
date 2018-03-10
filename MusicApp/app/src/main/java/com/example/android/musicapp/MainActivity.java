package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Sets the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Finds the View that shows the list item
        ListView songs = (ListView) findViewById(R.id.list);

        // Sets a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the list item is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent songsIntent = new Intent(MainActivity.this, NowPlaying.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

    }
}