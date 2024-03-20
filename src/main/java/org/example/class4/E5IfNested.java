package org.example.class4;

public class E5IfNested {
    public static void main(String[] args) {

        boolean mainDoor = false;
        boolean room1 = true;
        boolean room2 = false;


        if (mainDoor) {
            if(room1) {
                System.out.println("Room1 is open");
            }else{
                System.out.println("Room1 is closed");
            }

            if(room2) {
                System.out.println("Room2");
            }else {
                System.out.println("Room2 is closed");
            }

            }else{
            System.out.println("Main door is closed");
        }




    }
}