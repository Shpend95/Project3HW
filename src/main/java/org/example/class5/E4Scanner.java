package org.example.class5;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {


        /* next is going to pick the first word
        and charAt(0) is going to pick the first letter from that word
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the gender m/f");
        char gender=scanner.next().charAt(0);
        System.out.println(gender);
    }
}
