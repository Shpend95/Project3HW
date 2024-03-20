package org.example.class5;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {

        //Write a program that will read three inputs of scores (quiz, mid term, and final scores)
        // and determine the grade based on the following rules:
        //if the average score >=90 → grade=A
        //if the average score >= 70 and <90 → grade=B
        //if the average score>=50 and <70 → grade=C
        //if the average score<50 → grade=F

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your quiz scores");
        double quiz = scanner.nextDouble();
        System.out.println("Enter your mid term scores");
        double midTerm = scanner.nextDouble();
        System.out.println("Enter your final scores");
        double finalScores = scanner.nextDouble();
        double averageScores = (quiz + midTerm + finalScores) / 3;

        if (averageScores >= 90) {
            System.out.println("Your Grade is A");
        } else if (averageScores >= 70 && averageScores < 90) {
            System.out.println("Your Grade is B");
        } else if (averageScores >= 50 && averageScores < 70) {
            System.out.println("Your Grade is C");
        } else if (averageScores < 50) {
            System.out.println("Your Grade if F");
        }


    }
}
