package class8;

public class task3 {
    public static void main(String[] args) {

        //Create a 2D array(shorter way) in which first array consist of 4 names
        //and second array will contain grades.Then your program should print name of the students
        //that has A and B grade

        String[][] gradAndNames = {
                {"Lana", "Mat", "Maggy", "Sam", "Mike"},
                {"A","B","C","D"}
        };
        System.out.println(gradAndNames[0][3]);
        System.out.println(gradAndNames[1][0]);





    }
}
