package org.example.class5;

import java.util.Scanner;

public class E4Task {
    public static void main(String[] args) {

        Scanner scanner4=new Scanner(System.in);
        System.out.println("Do you have a credit card");
        boolean haveCreditCard= scanner4.nextBoolean();
        if(haveCreditCard){
            System.out.println("Whats the balance");
            double balance= scanner4.nextDouble();
            if(balance>1000){
                System.out.println("pay off ASAP");
            }else{
                System.out.println("you can spend more");
            }

        }else{
            System.out.println("We can offer you the credit card");
        }
    }
}
