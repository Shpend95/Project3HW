package org.example.class4;

public class E7 {
    public static void main(String[] args) {

        //Write a program to find the largest number among three numbers stored in three variables
        //called as num1, num2,num3 using nested if(numbers must be distinct).

        int num1 = 17;
        int num2 = 8;
        int num3 = 9;

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("num1 is largest " + num1);
            }
        } else if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("num2 is largest " + num2);
            }
        } else if (num3 > num1) {
            if (num3 > num2) {
                System.out.println("num3 is largest " + num3);
            }
        }


    }

}









