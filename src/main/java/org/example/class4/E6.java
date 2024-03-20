package org.example.class4;

public class E6 {
    public static void main(String[] args) {

        double morgageRate=4.5;
        double mortgagePrice=100000;

        if(morgageRate>4.5) {
            System.out.println("User will not buy a house");
        }else {
            System.out.println("Will consider to buy the house");
            if(mortgagePrice>100000){
                System.out.println("Take a loan");
            }else{
                System.out.println("Will buy it cash");
            }
        }

    }
}
