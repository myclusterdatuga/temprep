/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pipo-Admin
 */
public class Mavenproject1 {
    
 // menu for the administrators
    /*public static void menu_admin()
    {
        //variables
        int num, loop;
        String menu;
        
        menu = "";
        loop = 1;
        
        Scanner my_scaner = new Scanner (System.in);
        
        while (loop ==1) 
        {
            loop = 0;
            //menu
            System.out.println("1 - add song");
            System.out.println("2 - list of users");
            System.out.println("3 - change user details by name");
            System.out.println("4 - modify song name");
            System.out.println("5 - modify song price");
            System.out.println("6 - dellete song");
            //scaner
            menu = my_scaner.nextLine();
            num = Integer.parseInt(menu);
            //switch case to evoiding use a "forest of if statments"
            switch(num)
            {
                case 1:
                    ft_add_song();
                    break;
                case 2:
                    ft_list_users();
                    break;
                case 3:
                    ft_change_user_detail();
                    break;
                case 4:
                    ft_modify_song_name();
                    break;
                case 5:
                    ft_modify_song_price();
                    break;
                case 6:
                    ft_del_song();
                    break;
                default:
                    System.out.println("plese select an option from the menu");
                    loop =  1;
            }
        }
    }*/

        public static void ft_add_song()
        {
            // ArrayList
            ArrayList<Song_creation>songs = new ArrayList<>();
            
            
            Song_creation song1 = new Song_creation("Filipe", "admin", 10,0);
            Song_creation song2 = new Song_creation("user1", "user", 22,0);
            Song_creation song3 = new Song_creation("user2", "user", 8,0);
        
            songs.add(song1);
            songs.add(song2);
            songs.add(song3);
        }

    public static void main(String[] args) {
        // variables declaration
        String menu, username, password;
        String new_username, username_modify;
        String new_song, new_price,new_artist;
        
        int num, permission, loop;
        
        username  = "";
        password = "";
        
        //scaner and ArrayList
        Scanner my_scaner = new Scanner (System.in);
        
        
        //log in selection
        num = 0;
        System.out.println("1 -Login");
        menu = my_scaner.nextLine();
        num = Integer.parseInt(menu);
        //creating users and songs objects
        User user = new User("all users");
        Song song = new Song("all songs");
        //crete some users
        user.user_array( new User_creation("Filipe", "admin", true));
        user.user_array( new User_creation("user1", "user", false));
        user.user_array( new User_creation("user2", "user", false));
        //crate some songs
        song.song_array(new Song_creation("16-12-95","Sam the kid",120,0));
        song.song_array(new Song_creation("   Tu nao seabes","Sam the kid",10,0));
        
        // if option 1 is selected promt the user to enter username and password
        if (num == 1)
        {
            num = 0;
            System.out.println("username:");
            username = my_scaner.nextLine();
            System.out.println("Password");
            password = my_scaner.nextLine();
            //got to User class and check the if the user exists by lopping the users ArrayList and compare it to the input
            loop = 1;
            permission = user.checker(username);
            if(permission!= 0)
            {
                //admin menu(permissin is equal to 2)
                if(permission == 2)
                {
                    while (loop == 1) 
                    {
                        //menu
                        System.out.println("1 - add song");
                        System.out.println("2 - list of users");
                        System.out.println("3 - change user details by name");
                        System.out.println("4 - modify song name");
                        System.out.println("5 - modify song price");
                        System.out.println("6 - dellete song");
                        System.out.println("7 - exit menu");
                        

                        //scan
                        menu = my_scaner.nextLine();
                        num = Integer.parseInt(menu);
                        //switch case to evoiding use a "forest of if statments"
                        switch(num)
                        {
                            case 1:
                                System.out.println("enter the name of the song to create:");
                                new_song = my_scaner.nextLine();
                                System.out.println("enter the artist of the song: ");
                                new_artist = my_scaner.nextLine();
                                System.out.println("enter the price of the song: ");
                                new_price = my_scaner.nextLine();
                                num = Integer.parseInt(new_price);
                                if (song.Song_Checker(new_song,new_artist) == false)
                                {
                                    song.song_array(new Song_creation(new_song,new_artist,num,0));
                                    System.out.println("song successfully added");
                                }
                                else
                                    System.out.println("the song alredy exists");
                               break;
                            case 2:
                                user.getuser_array();
                                break;
                            case 3:
                                System.out.println("enter the user to modify: ");
                                username_modify = my_scaner.nextLine();
                                System.out.println("enter the new user: ");
                                new_username=my_scaner.nextLine();
                                if(user.modify_name(new_username,username_modify) == true){
                                     System.out.println("username sucessfuly modified");
                                    user.getuser_array();}
                                else{
                                     System.out.println("/n somthing went wrong plese verify that the user sellected is correct");
                                     user.getuser_array();}
                                break;
                            case 4:
                                System.out.println("check with prof if when adding a song is only necessery to check for name of the song or if we need to chek for the autor as well");
                                //song.Song_Checker(menu, new_artist)
                                break;
                            case 5:
                                
                                break;
                            case 6:
                                
                                break;
                            case 7:
                                loop =  0;
                            default:
                                System.out.println("plese select an option from the menu");
                                
                             
                        }
                    }
                    return;
                }
                else
                {
                    //menu_user();
                    return;
                }
            }
            else
            {
               System.out.println("The username or password are incorrect;");
               num = 1;
            }
        }   
        
    }
}
