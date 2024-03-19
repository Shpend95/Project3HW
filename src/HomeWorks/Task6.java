package HomeWorks;

public class Task6 {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not?
        int[] numbers = {6, 7, 8, 9, 10};

        for (int num : numbers) {
            if (num <= 1) {
                System.out.println(num + " is not a prime number.");
            } else {
                int count = 0;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println(num + " is a prime number.");
                } else {
                    System.out.println(num + " is not a prime number.");
                }
            }
        }

    }
}
