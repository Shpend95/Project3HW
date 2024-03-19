package HomeWorks;

public class Task3 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.


        int[] number = {20, 15, 10, 33, 27, 44, 88, 76, 120};
        for (int i = 0; i < number.length; i++) {
            if(number[i] % 2 ==0) {
                System.out.println(number[i]);

            }

        }

    }
}
