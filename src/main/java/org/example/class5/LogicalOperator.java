package org.example.class5;

public class LogicalOperator {
    public static void main(String[] args) {

        boolean box = false;
        System.out.println(!box);

        //or

        boolean boxes = true;
        boxes = !boxes;
        System.out.println(boxes);

        //or
        String country = "Uk";
        if (!country.equals("IRAN")) {
            System.out.println("You can visit USA");
        } else {
            System.out.println("Not Allowed");
        }


    }
}
