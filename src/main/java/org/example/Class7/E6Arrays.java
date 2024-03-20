package org.example.Class7;

public class E6Arrays {
    public static void main(String[] args) {

      ///Create an array of cars and store 6 elements into it.Using 2  different loops
        //print all values from the array.

        String [] cars={"BMW","Lambo","Ferrari","Audi","Kia","Toyota"};
        for(int i=0;i<6;i++) {
            System.out.println(cars[i]);
        }

        //or

        int i=0;
        while(i<6){
            System.out.println(cars[i]);
            i++;

        }

        //or
        System.out.println(cars.length);
        int j=0;
        while(j< cars.length){
            System.out.println(cars[j]);
            j++;
        }



    }
}
