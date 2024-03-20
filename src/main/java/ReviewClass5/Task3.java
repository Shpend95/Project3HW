package ReviewClass5;

public class Task3 {
    public static void main(String[] args) {

        //calculate the avg of the numbers which are greater than 25
        //using enhanced for loop


        int[] numbers = {10, 25, 45, 66, 85, 100};
        double sum = 0;
        int counter=0;
        for(int n:numbers){
            if(n>25){
                sum+=n;
                counter++;

            }

        }
        System.out.println(sum/counter);


    }
}


