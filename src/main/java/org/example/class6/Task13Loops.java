package org.example.class6;

import java.util.Scanner;

public class Task13Loops {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting number from the loop");
        int start=scanner.nextInt();
        System.out.println("Please enter the ending number");
        int end=scanner.nextInt();
        System.out.println("Please Enter the step size");
        int size= scanner.nextInt();
        while(start<=end){
            System.out.println(start+" ");
            start=start+size;
        }

    }
}
