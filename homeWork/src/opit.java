public class opit {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println("Pi : " + pi);
        System.out.printf("Pi : %.4f", pi);

        System.out.println();

        double money = 100;
        double people = 3;
        System.out.println(money / people);
        System.out.printf("%.2f",money / people);
        System.out.println();
        System.out.print("======================");
        System.out.println();
        System.out.printf("%.0f",money / people);
    }
}
