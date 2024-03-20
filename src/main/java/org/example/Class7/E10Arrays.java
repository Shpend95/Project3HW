package org.example.Class7;

public class E10Arrays {
    public static void main(String[] args) {

        //From an array of integer elements find the largest number


        int[] numbers = {1, 2, 3, 4, 5};
        int largest = 0;
        for (int num1 : numbers) {
            if (largest < num1) {
                largest = num1;
            }
        }
        System.out.println(largest);

        //or

        int[] number = {1, 4, 6, 7, 8};
        int large = 0;
        for (int num : number) {
            large = num;
        }
        System.out.println(large);

        //or for lowest number

        int[] numberss = {11, 54, 67, 43, 23};
        int min = numberss[0];
        for (int m : numberss) {
            if (m < min) {
                min = m;
            }
        }
        System.out.println(min);

        //or

        int[] prices = {22, 43, 33, 221, 456};
        int greatest = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > greatest) {
                greatest = prices[i];
            }
        }
        System.out.println(greatest);


        //he starts with
        // the first element and compares the rest of the elements in the array against it.
        //you could also assume 0 is the biggest, but that would limit us in case there are negative numbers.
        // That is why he starts with the first number and considers it as a hypothetical maximum
        //f you had all negative numbers that would return 0 as max even though it doesn't exist in the array.

    }
}

