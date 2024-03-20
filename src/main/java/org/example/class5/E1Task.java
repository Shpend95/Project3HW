package org.example.class5;

import java.util.Scanner;

public class E1Task {
    public static void main(String[] args) {

        Scanner scanner1=new Scanner(System.in);
        System.out.println("What is the amount you need? ");
        int loanAmount= scanner1.nextInt();
        if(loanAmount<=200000){
            System.out.println("Sure");
        }else{
            System.out.println("Sorry not this time");
        }


    }
}
