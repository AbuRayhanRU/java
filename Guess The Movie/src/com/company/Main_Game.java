package com.company;

import java.util.Scanner;

public class Main_Game {
    public void play(){

        Movies movie_obj=new Movies();
        char[] hide_movie=new char[movie_obj.size];
        hide_movie=movie_obj.the_movie();
        String real_movie=movie_obj.s;
        int movie_length=real_movie.length();
        int game_life=10;
        Scanner input=new Scanner(System.in);
        String wrong_input="";

        while (game_life>0){
            System.out.print("you r gessing:");
            System.out.println(hide_movie);
            char user_input=input.next().charAt(0);

            boolean check=false;

            for (int i=0;i<movie_length;i++){
                if (user_input==real_movie.charAt(i)){
                    hide_movie[i]=user_input;
                    check=true;
                }
            }
            if (!check){
                boolean contain=false;
                for (int i=0;i<wrong_input.length();i++){
                    if (wrong_input.charAt(i)==user_input){
                        contain=true;
                    }
                }
                if(!contain){
                    wrong_input+=(" "+user_input);
                    game_life--;
                }
            }
            boolean finished=true;
            for (int i=0;i<movie_length;i++){
                if(hide_movie[i] == '_'){
                    finished=false;
                }
            }
            if(finished){
                System.out.println("you win!!!");
                return;
            }
            System.out.println("You have guessed (" + (10-game_life) + ") wrong letters: " + wrong_input);

        }

        System.out.println("you lost");
    }

}
