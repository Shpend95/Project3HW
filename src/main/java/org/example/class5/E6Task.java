package org.example.class5;

import java.util.Scanner;

public class E6Task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        if(height<60){
            System.out.println("Short");
        }else if(height>60 && height<72){
            System.out.println("Medium");
        }else{
            System.out.println("Tall");
        }
        }

    }

