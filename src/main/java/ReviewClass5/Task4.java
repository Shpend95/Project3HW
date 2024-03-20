package ReviewClass5;

public class Task4 {
    public static void main(String[] args) {
        ////Count how many even numbers are present in this array

        int[] numbers = {10, 25, 45, 66, 85, 100, 26, 89, 56, 33};
        int count = 0;

        for (int n : numbers) {
            if ( n % 2 == 0) {
                count++;

            }
        }
        System.out.println(count);

    }
}
