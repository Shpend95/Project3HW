package org.example.class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner IsCan= new Scanner(System.in);
        System.out.println("Please enter the price of apples");
        double price=IsCan.nextDouble();
        System.out.println("The price of apple is " +price);
    }
}
