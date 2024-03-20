package org.example.class5;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        //Prompt the user to enter person heights in inches. Person should be classified as one of the following:
        //• short (under 60 inch)
        //• medium(between 60 -72 inch)
        //• tall (over 72 inch)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your height");
        double height = scanner.nextDouble();
        if (height < 60) {
            System.out.println("Short");
        } else if (height >= 60 && height <= 72) {
            System.out.println("Medium");
        } else if (height > 72) {
            System.out.println("Tall");
        } else {
            System.out.println("Please enter number");
        }

    }
}
