package tasks3;
//Необходимо создать целочисленную переменную, присвоить произвольное значение
// переменной на ваш выбор и вывести следующие строки:
//        ●больше 10 - если переменная больше 10
//        ●меньше 100 - если переменная меньше 100
//        ●результат деления на 2 больше 20 - если это соответствует истине
//        ●значение переменной между 5 и 40 включительно - если это правда
//        ●значение переменной меньше 5 или больше 40 - если предыдущие условие
//        ложное

import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 10){
            System.out.println("a > 10");
        }
        if (a > 100){
            System.out.println("a > 100");
        }
        if (a / 2.0 > 20){
            System.out.println("a / 2 > 20");
        }
        if (a >= 5 && a <= 40){
            System.out.println("a = 5, a = 40");
        }else {
            System.out.println("a = 5, a = 40 a > ");
        }
    }
}
