package org.example.Class7;

public class E7Arrays {
    public static void main(String[] args) {

        //Create an array of animals and store 5 elements into it. using 2 different loops print all
        //elements from the array

        String[] animalNames = {"Leo", "Tiger", "Elephant", "Cat", "Dog"};
        for (String a: animalNames) {
            System.out.println(a);
        }
        //or

        int i=0;
        while(i<5){
            System.out.println(animalNames[i]);
            i++;

        }

        //or

        for(int j=0;j<5;j++){
            System.out.println(animalNames[j]);
        }

    }
}
