package org.example.class6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
        // Based on operator provide the result to user.
        //Please complete this assignment in 2 ways: using if statement and switch case.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double number1 = scanner.nextDouble();
        System.out.println("Enter operator sign");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter second number");
        double number2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("The result is " + (number1 + number2));
                break;
            case '-':
                System.out.println("The result is " + (number1 - number2));
                break;
            case '*':
                System.out.println("The result is " + (number1 * number2));
                break;
            case '/':
                System.out.println("The result is "+(number1/number2));
                break;
            default:
                System.out.println("Not Acceptable");


        }


    }
}
