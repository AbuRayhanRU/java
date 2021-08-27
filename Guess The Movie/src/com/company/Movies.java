package com.company;

import java.util.Random;

public class Movies {
    final String[] movies={
            "the shawshank redemption",
            "the godfather",
            "the dark knight",
            "schindler's list",
            "pulp fiction",
            "the lord of the rings",
            "the good the bad and the ugly",
            "fight club",
            "the lord of the rings",
            "forrest gump",
            "star wars",
            "inception",
            "the lord of the rings",
            "the matrix",
            "samurai",
            "star wars",
            "city of god",
            "the silence of the lambs",
            "batman begins",
            "die hard",
            "chinatown",
            "room",
            "dunkirk",
            "fargo",
            "no country for old men",
    };
    public Random rand=new Random();
    public int rand_number=rand.nextInt(movies.length);
    int size=movies[rand_number].length();
    String s;
    char[] temp_ans=new char[size];

    public char[] the_movie(){
        s=movies[rand_number];
        for (int i=0;i<size;i++){
            if(s.charAt(i)!=' '){
                temp_ans[i]='_';
            }
            else {
                temp_ans[i]=' ';
            }
        }
        return temp_ans;
    }
}
