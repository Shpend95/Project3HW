package org.example.Class7;

public class E55Task {
    public static void main(String[] args) {

        //Create an array to store char values and then print in reverse order

        char[] word = {'S', 'B', 'C', 'D', 'E', 'F'};


        for (int l = word.length - 1; l >= 0; l--) {
            System.out.println(word[l]);
        }

        //or
        int i =6;
        while(i>0){
            System.out.println(word[i-1]);
            i--;
        }



    }
}
