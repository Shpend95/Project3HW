package org.example.class6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the country ");
        String country= scan.nextLine();


        switch (country){
            case "USA":
                System.out.println("We speak Engish");
                break;
            case "Sweeden":
                System.out.println("We speak Swedish");
                break;
            case "Russia":
                System.out.println("We speak Russian");
                break;
            case"Albania":
                System.out.println("We speak Albanian");
                break;
            case "Italia":
                System.out.println("We speak Italian");
            default:
                System.out.println("Country not supported");

        }

    }
}
