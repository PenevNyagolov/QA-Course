public class Discount {
    public static void main(String[] args) {
        int cartTotal = 1100;
        double totalToPay;
//&& {and}
//|| {or}
// !
//        true && true == true
//        true && false == false
//        false && true == false
//
//        true || true == true
//        true || false == false
//        false || true == false
//        false || false == false
//        if(cartTotal > 500 && cartTotal < 1000)
        if (cartTotal > 1000){
            System.out.println("Discount 15% applied");
            totalToPay = cartTotal * 0.85;
        }else if (cartTotal > 500){
            System.out.println("Discount 10% applied");
            totalToPay = cartTotal * 0.9;
        }else{
            totalToPay = cartTotal;
        }
        System.out.println("Your total : " + totalToPay);
    }
}
