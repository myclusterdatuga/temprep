/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Pipo-Admin
 */
public class User_creation {
    //variables
    String password, username;
    boolean stats;
    
     //username and password, the bool is used to verrify if the user is admin or not(True for admin and False to normal rights)
    public User_creation(String username,String password,Boolean stats)
    {
        this.username = username;
        this.password = password;
        this.stats = stats;
    }
   
   
    //check if the user is valid comparing the input to the present username, returning true if the user match
     public boolean User_Checker(String username)
    {
        if(username.equals(this.username))
            return(true);
        else
            return(false);
    }
    
    //change username of a user
    public void modify(String username)
    {
        this.username = username;
    }
    //print the username and password
    public void print()
    {
         System.out.println("username: " + this.username +" password: " + this.password);
    }
    
    //get the status of the acount (true is admin and false is standard)
    public boolean getstats()
    {
        return(this.stats);
    }
    public String getPassword()
    {
        return(this.password);
    }
    public String getUsername()
    {
        return(this.username);
    }
}
