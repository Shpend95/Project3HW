package org.example.class5;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        //Ask user to enter a number and then categorize if number is small, medium or large
        //Small number is value between 1 and 10
        //Medium number is value between 11 and 100
        //Large number is value between 101 and 1000

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter number");
        int number = scanner.nextInt();

        if (number >= 1 && number<=10){
            System.out.println("Small number");
        }else if (number >= 11 && number <= 100) {
            System.out.println("Medium number");
        } else if (number>=101 && number<=1000){
            System.out.println("Large number");
        }else {
            System.out.println("Invalid number");
        }
    }


}
