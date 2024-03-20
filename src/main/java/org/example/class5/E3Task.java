package org.example.class5;

import java.util.Scanner;

public class E3Task {
    public static void main(String[] args) {

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please add the city you are from");
        String city = scanner3.nextLine();


        System.out.println("Whats the temperature in your city");
        double tempF = scanner3.nextDouble();
        double tempCelsius = (tempF - 32) * 5 / 9;
        String celsiusSymbol = "\u2103";
        System.out.println("The temperature in the " + city + " is " + tempCelsius + celsiusSymbol);


    }
}
