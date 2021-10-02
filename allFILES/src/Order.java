public class Order {

//import takeout.Drink;
//import takeout.MainDish;
//import takeout.Side;

        private String clientName;
        private int orderNumber;
        private MainDish mainDishChoice;
        private Side sideChoice;
        private Drink drinkChoice;
        private double tips;
        private double totalPrice;

        private static int count = 1;

        public int createOrderId() {
            return count ++;
        }

        Order(String name) {
            this.clientName = name;
        }

        public String getClientName() {
            return clientName;
        }


        ///firstOrder.setOrderNumber(firstOrder.createOrderId());

        public void setClientName(String clientName) {
            this.clientName = clientName;
        }

        public int getOrderNumber() {
            return orderNumber;
        }

        public void setOrderNumber(int orderNumber) {
            this.orderNumber = orderNumber;
        }

        public MainDish getMainDishChoice() {
            return mainDishChoice;
        }

        public void setMainDishChoice(MainDish mainDishChoice) {
            this.mainDishChoice = mainDishChoice;
        }

        public Side getSideChoice() {
            return sideChoice;
        }

        public void setSideChoice(Side sideChoice) {
            this.sideChoice = sideChoice;
        }

        public Drink getDrinkChoice() {
            return drinkChoice;
        }

        public void setDrinkChoice(Drink drinkChoice) {
            this.drinkChoice = drinkChoice;
        }

        public double getTips() {
            return tips;
        }

        public void setTips(double tips) {
            this.tips = tips;
        }

        public double getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
        }

        public static int getCount() {
            return count;
        }

        public static void setCount(int count) {
            Order.count = count;
        }
}
