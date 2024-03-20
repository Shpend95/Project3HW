package org.example.class4;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner iceCan= new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age=iceCan.nextInt();
        System.out.println("You are "+age+ " years old");

        System.out.println("What is your name?" );
        String name= iceCan.next();
        System.out.println("Cool name, " +name);
    }

}
