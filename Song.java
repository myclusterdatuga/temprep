/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Pipo-Admin
 */
public class Song {
     //variables
    int  Records_sold, song_id;
    double price;
    String title, artist;
    
    public Song(String title,String artist,double price)
    {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.Records_sold = 0;
        this.song_id ++;
    }
    // following thw same line of thinking used in the function Cheker in the class User_creation
    // Can not have the same Artist and Name
    // Since you can have songs with the same Name or Artist, just check if both of them are equall
    public boolean addSong_Checker(String Insong, String Inartist)
    {
        if(Insong.equals(this.title) && this.artist.equals(Inartist))
            return(true);
        else
            return(false);
    }
    //Check if the song passesd as a parameter is equal to the curent song
    public boolean Song_Checker(String Insong)
    {
        if(Insong.equals(this.title))
            return(true);
        else
            return(false);
    }    
     @Override
    public String toString()
    {
        return ("username: " + this.title +" password: " + this.artist +"price :" + this.price +"id :"+ this.song_id );
    }
    
      public void incrementrecords(int records_bought) 
        // when buying a copy, this will increment the purchase counter withe the input number
    {
        this.Records_sold += records_bought;
    }
       public String getName() // returning atributes to re-use it 
    {
        return this.title; 
    }
    public String getArtist()
    {
        return this.artist;
    }
    public int getId()
    {
        return this.song_id;
    }
     public double getPrice()
    {
        return this.price;
    }
    // the rest of the Attributes are not being returned since 
    // they are not being used within this individual assessment
}
