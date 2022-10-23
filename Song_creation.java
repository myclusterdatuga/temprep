/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Pipo-Admin
 */
public class Song_creation {
     //variables
    int price, number_records_selled;
    String song, artist;
    
    public Song_creation(String song,String artist,int price,int number_records_selled)
    {
        this.song = song;
        this.artist = artist;
        this.price = price;
        this.number_records_selled = number_records_selled;
    }
    //!!!!check with techer if is necessery to check the artist as well
    // following thw same line of thinking used in the function Cheker in the class User_creation
    public boolean SongChecker(String song, String artist)
    {
        if(song.equals(this.song) && this.artist.equals(artist))
            return(true);
        else
            return(false);
    }
    
    public boolean Song_Checker(String song)
    {
        if(song.equals(this.song))
            return(true);
        else
            return(false);
    }
}
