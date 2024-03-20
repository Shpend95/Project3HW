package HomeWorks;

public class Task8 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?


        int[] numbers = {23, 12, 34, 56, 42, 67, 87};
        int min=numbers[0];
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];

            }
        }
        System.out.println(min);

        int max=0;
        for(int j=0; j<numbers.length;j++){
            if(numbers[j]>max){
                max=numbers[j];

            }
        }
        System.out.println(max);



    }
}
