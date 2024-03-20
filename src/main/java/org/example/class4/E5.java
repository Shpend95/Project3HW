package org.example.class4;

public class E5 {
    public static void main(String[] args) {

        //Write a program to store a value whether user has degree or not.
        // If user has a degree, you should say congratulations and after that check
        // If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”,
        // otherwise → “You should have studied harder” . if user does not have a degree print you should get a degree

        boolean degree=true;
        double gpa=3.5;


        if(degree){
            System.out.println("Congralutations");
            if(gpa>=3.5) {
                System.out.println("You are eligibile for scholarship");
            }else{
                System.out.println("You should have studied harder");
            }
        }else {
            System.out.println("You should get a degree");

        }
    }
}
