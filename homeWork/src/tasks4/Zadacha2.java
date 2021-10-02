package tasks4;

import java.util.Scanner;

//Необходимо вывести все положительные степени
//        числа 5 которые меньше 10000 (результат возведения в степень меньше 10000).
public class Zadacha2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("4исла которые меньше 10000");
//        int a = scanner.nextInt();

        for (int i = 5; i < 10000; i = i * 5) {
            System.out.println(i);
        }
    }
}
