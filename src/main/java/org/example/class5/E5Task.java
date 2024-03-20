package org.example.class5;

import java.util.Scanner;

public class E5Task {
    public static void main(String[] args) {

        //Write a program to ask user to enter number of worked years and annual salary.
        //if user worked for more or equals

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of wokred years");
        double years= scanner.nextDouble();

        if(years>=5){
            System.out.println("Enter your annual salary");
            double salary=scanner.nextDouble();
            System.out.println("you are eligible for bonus");
            if(salary>50000){
                System.out.println("your bonus is 50000");
            }else{
                System.out.println("your bonus is 30000");
            }
         }else{
            System.out.println("you are not eligible to get a bonus");
        }

        }
    }

