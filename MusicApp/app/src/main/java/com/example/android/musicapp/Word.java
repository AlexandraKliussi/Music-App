package com.example.android.musicapp;

/**
 * Created by Alex on 10.03.2018.
 */

/**
 * {@link Word} represents a song that the user wants to hear.
 * It contains a Song Name and an Artist Name for that word.
 */
public class Word {

    /**
     * Song Name for the word
     */
    private String mSongName;

    /**
     * Artist Name for the word
     */
    private String mArtistName;

    /**
     * Creates a new Word object.
     *
     * @param songName   is the Song Name
     * @param artistName is the Artist Name
     */
    public Word(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    /**
     * Gets the song name of the word.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Gets the artist name of the word.
     */
    public String getArtistName() {
        return mArtistName;
    }

}

