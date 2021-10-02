package metodAndSolving;

public class tasks1 {
    public static void main(String[] args) {

        simpleMethod1();
        simpleMethod2();
        simpleMethod3("Wednesday");
    }
    public static void simpleMethod1(){
        System.out.println("ala");
    }
    public static String simpleMethod2(){
        System.out.println("bala");
        String abc = "strocha";
        return abc;
    }
    public static void simpleMethod3(String dayOfTheWeek){
        System.out.println("Today is " + dayOfTheWeek);
    }
}
