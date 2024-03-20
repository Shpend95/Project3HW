package org.example.class5;

import java.util.Scanner;

public class E4Task2 {
    public static void main(String[] args) {


        Scanner scanner5=new Scanner(System.in);
        System.out.println("Do you have the credit card");
        String iDo= scanner5.next();
        if(iDo.equalsIgnoreCase("Yes")){

            System.out.println("What is balance on the card?");
            double balance= scanner5.nextDouble();
            if(balance>10000){
                System.out.println("pay asap");
            }else {
                System.out.println("spend more");

            }

            }

        }
        }




