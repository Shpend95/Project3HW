package org.example.class3;

public class ArithmeticOperators1 {
public static void main(String[] args) {

    //Write a Java program to add, subtract, multiply and divide 2 decimal values.
    // Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”

    //The addition of 2 numbers 10.0 and 20.0 is equal to 30.0

    double num1=10.2;
    double num2=20.3;


    System.out.println("The Addition of 2 numbers " +num1+ " and " +num2+ " is equal to " +(num1+num2));
    double sub =(num1-num2);
    System.out.println("The Substraction of 2 numbers " +num1+ " and " +num2+ " is equal to " +sub);
    double mul =(num1*num2);
    System.out.println("The Mulitplication of 2 numbers " +num1+  "and " +num2+ " is equal to " +mul);
    double divide =(num1/num2);
    System.out.println("The Divide of 2 numbers " +num1+ " and " +num2+ " is equal to " +divide);
    System.out.println();



    int width=5;
    int height=8;
    int perimeter =2* (5+8);
    int area =(width*height);

    System.out.println("The perimeter of rectangle with width " +width+ " and height " +height+ " is equal to " +perimeter+ " and the area is equal to " +area);




}

}
