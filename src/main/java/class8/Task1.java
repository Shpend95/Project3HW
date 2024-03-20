package class8;

public class Task1 {
    public static void main(String[] args) {

        //add all of the elements from 2D Array and print the sum

        int[][] matrix = {
                {10, 20, 40, 50},
                {22, 40, 90, 65},
                {15, 50, 33, 30}
        };

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println(sum);


    }
}
