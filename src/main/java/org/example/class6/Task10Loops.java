package org.example.class6;

public class Task10Loops {
    public static void main(String[] args) {

        //Print even numbers from 20 to 100
        //expected output 20 22 24 26..100
        for (int i = 1; i < 102; i += 2) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}
