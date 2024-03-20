package class8;

public class EBreak {
    public static void main(String[] args) {

        String [] names={"James","Iram","Fab","Aladin","Ana","Silvia"};
        //search for the name Iram if it present print on the console name is present


        String name="Fab";
        for(String n:names){
          if(n.equals(name)){
              System.out.println(n+" is present");

          }
        }

        //or
        for(String n:names){
            if(n.equals("James")){
                System.out.println(n+" is present");
                break;
                //break is used always in loops, why use break?- save resources(save a lot of unnecessary
                //processing by terminating the loop once the goal is complete.
                //break keyword breaks the loop.
            }

        }





    }
}
