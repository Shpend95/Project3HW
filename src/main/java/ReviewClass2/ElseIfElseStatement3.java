package ReviewClass2;

public class ElseIfElseStatement3 {
    public static void main(String[] args) {


        boolean haveCoupon=true;
        int coupon=20;

        if(haveCoupon){

            if(coupon==10){
                System.out.println("Apply 10% dicount");
            }else if (coupon==20) {
                System.out.println("Apply 20% dicount");
            }else{
                System.out.println("Wrong coupon code");
            }
        }
    }
}
