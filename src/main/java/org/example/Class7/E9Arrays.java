package org.example.Class7;

public class E9Arrays {
    public static void main(String[] args) {

        //Create an array on integers and calculate the sum of all elements in an array

        int []numbers={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<numbers.length;i++){
           sum+=numbers[i];
        }
        System.out.println(sum);

        //or ... its the same thing below

        int[] nums={2,4,6,345,67,5};
        int ssum=0;
        for(int j=0;j<nums.length;j++){
            ssum+=nums[j];

        }
        System.out.println(ssum);



}

    }