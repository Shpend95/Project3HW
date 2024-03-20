package org.example.Class7;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        //Create an array of names and store all names of your group.Then print your name from that array.(use 2 different
        // ways of creating an array).

        String [] names = new String[10];
        names [2]= "Sam";
        names[4] = "James";

        System.out.println(Arrays.toString(names));

        //or


        //String[] group4={"Asllan","Asgan","Sam","Mike","Arthur"};

        //System.out.println(group4[2]);
    }
}
