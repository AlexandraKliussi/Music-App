package com.example.android.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alex on 07.03.2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        // This initializes the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, I used 0.
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Checks if the existing view is being reused, otherwise inflates the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Gets the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Finds the TextView in the list.xml layout with the ID version_name
        TextView songsTextView = (TextView) listItemView.findViewById(R.id.song);
        // Gets the song name from the current Word object and
        // sets this text on the song TextView
        songsTextView.setText(currentWord.getSong());

        // Finds the TextView in the list_item.xml layout with the ID version_number
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist);
        // Gets the artist name from the current Word object and
        // sets this text on the artist TextView
        artistTextView.setText(currentWord.getArtist());

        // Returns the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}