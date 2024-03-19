package HomeWorks;

public class Task1 {
    public static void main(String[] args) {
        //Create a program that uses an array to store a list of temperatures for a week,
        // and then uses a loop to find the highest and lowest temperature for the week.

        double[] temperature={60.5,77.5,90.3,50.2,88.0,76.6,55.0};
        double highest=temperature[0];
        double lowest=temperature[0];

        for(int i=0; i<temperature.length; i++){
            if(temperature[i]>highest){
                highest=temperature[i];

            }
            if(temperature[i]<lowest){
                lowest=temperature[i];
            }
        }
        System.out.println("The highest temperature of the week is:" +highest+ "F");
        System.out.println("The lowest temperature of the week is:"+lowest+ "F");

    }
}
