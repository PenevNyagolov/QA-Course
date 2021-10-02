package tasks3;

import java.util.Scanner;

//Необходимо создать две целочисленные переменные (a, b), присвоить
// произвольные значения переменным на ваш выбор и вывести следующие строки:
//        ●maybe a and b are even - если сумма переменных четная
//        some variable is odd - если сумма переменных нечетная
public class Zadacha2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        if (sum % 2 == 0){
            System.out.println("maybe a and b are even");
        }else {
            System.out.println("some variable is odd");
        }
    }
}
