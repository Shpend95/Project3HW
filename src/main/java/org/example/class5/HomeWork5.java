package org.example.class5;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        //Write a program for user to enter his/hers birth month. Based on the month define the season.
        //Example: if user is born in March, April, May → season =”Spring”
        //if user is born in June, July, August →
        //season =”Summer”  etc …
        //At the end of the program we should see 1 output as “You were born is season ______”.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your birth month");
        String month = scanner.nextLine().toLowerCase();
        switch (month) {
            case "march":
            case "april":
            case "may":
                System.out.println("You were born in Spring season");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("You were born in Summer season");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("You were born in Autumn season");
                break;
            case "december":
            case "january":
            case "february":
                System.out.println("You were born in Winter season");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }


    }


}

