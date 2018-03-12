package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Alex on 07.03.2018.
 */

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creates a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Song One", "Artist One"));
        words.add(new Word("Song Two", "Artist Two"));
        words.add(new Word("Song Three", "Artist Three"));
        words.add(new Word("Song Four", "Artist Four"));
        words.add(new Word("Song Five", "Artist Five"));
        words.add(new Word("Song Six", "Artist Six"));
        words.add(new Word("Song Seven", "Artist Seven"));
        words.add(new Word("Song Eight", "Artist Eight"));
        words.add(new Word("Song Nine", "Artist Nine"));
        words.add(new Word("Song Ten", "Artist Ten"));


        // Creates an {@link ListAdapter}, whose data source is a list of {@link Songs}. The
        // adapter creates list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Finds the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // string list file.
        ListView songs = (ListView) findViewById(R.id.list);

        // Makes the {@link ListView} use the {@link ListAdapter} created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        songs.setAdapter(adapter);
    }
}

