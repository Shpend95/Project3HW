package org.example.class4;

import java.util.Scanner;

public class JavaSwitch {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("What day is today");
        String days=scanner.nextLine();

        String day = "Monday";

        switch (day) {
            case "Sunday": System.out.println("It is Sunday");
            break;
            case "Monday": System.out.println("It is Monday");
            break;
            case "Tuesday": System.out.println("It is Tuesday");
            break;
            case "Wednesday": System.out.println("It is Wednesday");
            break;
            case "Thursday": System.out.println("It is Thursday");
            break;
            case "Friday": System.out.println("It is Friday");
            break;
            case "Saturday": System.out.println("It is Saturday");
            break;
            default: System.out.println("That is not a day");
        }

    }

}
