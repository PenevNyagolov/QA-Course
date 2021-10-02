public class IntroToMethods {

    public static void main(String[] args) {

        // Вызов первого метода
        simpleMethod1();

        // Вызов и вывод результата второго метода
        String result = simpleMethod2();
        System.out.println(result);

        //
        String resultOfMethod3 = simpleMethod3("Wednesday");
        System.out.println("I'm back from method3: " + resultOfMethod3);

        System.out.println(powerOf2(4));

        System.out.println(isEven(4));
        System.out.println(isEven(7));
        System.out.println(isEven(12));
        System.out.println(isEven(25));
    }

    public static void simpleMethod1() {
        System.out.println("Привет, я есть, но только внутри метода.");
    }

    public static String simpleMethod2() {
        System.out.println("Привет, я есть, но только внутри метода.");

        String abc = "А я строчка которая вернулась из метода обратно в программу.";

        return abc;
    }

    public static String simpleMethod3(String dayOfTheWeek) {
        System.out.println("Today is " + dayOfTheWeek);

        return dayOfTheWeek;
    }

    public static int powerOf2(int param1) {
        return param1 * param1;
    }

    public static boolean isEven(int value) {
        boolean result = value % 2 == 0;
        return result;
    }

}
