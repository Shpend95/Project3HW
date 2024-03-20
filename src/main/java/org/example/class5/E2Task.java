package org.example.class5;

import java.util.Scanner;

public class E2Task {
    public static void main(String[] args) {

        Scanner scanner2=new Scanner(System.in);
        System.out.println("How old are you? ");
        int age= scanner2.nextInt();
        if(age>18){
            System.out.println("You are eligible ");
        }else{
            System.out.println("You need to get learner permit first");
        }
    }
}
