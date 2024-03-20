package org.example.class4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {

        Scanner IceScan1 =new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age=IceScan1.nextInt();
        System.out.println("Please Enter your salary");
        double salary=IceScan1.nextDouble();
        System.out.println("Please Enter your name");
        String name=IceScan1.next();
        System.out.println("My name is " +name+ " and Im " +age+ " years old and my salary is "+salary);
    }
}
