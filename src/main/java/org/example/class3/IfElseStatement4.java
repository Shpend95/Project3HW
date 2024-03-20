package org.example.class3;

public class IfElseStatement4 {
    public static void main(String[] args) {

        //Create a Java program and name it Temperature Check.
        //Create variable to store temperature. Your program
        //should check if temperature is below 32 then it should
        //print “Water will freeze with temperature __”, otherwise
        //“Water will NOT freeze with temperature __”.
        // */

        int temp=50;
        if(temp<32)
            System.out.println("The water will freeze with temperature " +temp);
        else {
            System.out.println("The water will Not freeze with temperature " +temp);
        }
    }
}
