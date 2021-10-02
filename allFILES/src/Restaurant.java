public class Restaurant {
//    import takeout.utils.PrintUtils;

//import static takeout.utils.PrintUtils.*;

        public static void main(String[] args) {

            Menu menu = new Menu();
            menu.printMenu();

            Order firstOrder = new Order("John Smith");

            firstOrder.setOrderNumber(firstOrder.createOrderId());

            println();

            System.out.println(firstOrder.getOrderNumber() + "          " + firstOrder.getClientName());



            Order secondOrder = new Order("Jane White");

            secondOrder.setOrderNumber(secondOrder.createOrderId());

            println();

            System.out.println(secondOrder.getOrderNumber() + "          " + secondOrder.getClientName());




            Order thirdOrder = new Order("Paul Black");

            thirdOrder.setOrderNumber(thirdOrder.createOrderId());

            println();

            System.out.println(thirdOrder.getOrderNumber() + "          " + thirdOrder.getClientName());


        }
    }

