/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author Pipo-Admin
 */
import java.util.ArrayList;
public class Song {
    private ArrayList<Song_creation>songs;
    
     String name;
    public Song(String Name)
    {
        name = Name;
        songs = new ArrayList<Song_creation> ();
    }
     public void song_array(Song_creation temp)
    {
        songs.add(temp);
    }
    //using the same logic as in the Checker funcrtion in the class User
    public boolean Song_Checker(String song, String artist)
    {
        for(int count=0; count < songs.size(); count++)
        {
            Song_creation currentSong = songs.get(count);
            //returning the result of the function SongChecker
            return(currentSong.SongChecker(song, artist));
        }
        return false;
    }
}
