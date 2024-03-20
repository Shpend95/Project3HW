package org.example.class6;

import java.awt.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade=scanner.next().charAt(0);

        switch(grade){
            case'A':
            case'a':
                System.out.println("A-Excellent");
                break;
            case'B':
            case'b':
                System.out.println("B-Good");
                break;
            case 'C':
            case'c':
                System.out.println("C-Average");
                break;
            case'D':
            case'd':
                System.out.println("D-Bad");
                break;
            case'F':
            case'f':
                System.out.println("F-Fail");
                break;
            default:
                System.out.println("Not acceptable");










        }


    }
}
