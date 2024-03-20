package class8;

public class Freestyle {
    public static void main(String[] args) {

        String[] names=new String[3];
        names[0]="John";
        names[1]="Sam";
        names[2]="Mike";

        char[] garde=new char[3];
        garde[0]='A';
        garde[1]='B';
        garde[2]='C';

        System.out.println(names[1]+" "+garde[0]+" ");


        //Create a 2D array(shorter way) in which first array consist of 4 names
        //and second array will contain grades.Then your program should print name of the students
        //that has A and B grade

        String[][] gradesAndNames={
                {"Sam","Jimmy","Paul"},
                {"A","B","C"}
        };
        System.out.println(gradesAndNames[0][1]);
        System.out.println(gradesAndNames[1][0]);


    }
    }

