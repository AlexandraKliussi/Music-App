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
     * Song for the word
     */
    private String mSong;

    /**
     * Artist for the word
     */
    private String mArtist;

    /**
     * Creates a new Word object.
     *
     * @param song   is the Song
     * @param artist is the Artist
     */
    public Word(String song, String artist) {
        mSong = song;
        mArtist = artist;
    }

    /**
     * Gets the song of the word.
     */
    public String getSong() {
        return mSong;
    }

    /**
     * Gets the artist of the word.
     */
    public String getArtist() {
        return mArtist;
    }

}

