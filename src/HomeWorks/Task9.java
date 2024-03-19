package HomeWorks;

public class Task9 {
    public static void main(String[] args) {
        //Write a java program to find the second largest number in the array?

        int[] prices = {22, 67, 87, 43, 58, 92, 31};
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i]>largest) {
                secondLargest=largest;
                largest=prices[i];

            } else if(prices[i]>secondLargest && prices[i]!=largest){
                secondLargest=prices[i];

            }
        }
        System.out.println(secondLargest);

    }
}
