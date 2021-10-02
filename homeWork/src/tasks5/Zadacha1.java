package tasks5;

import java.util.Arrays;

//Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//        Для указанной строки ответ будет “ооооо” (или в столбик)
public class Zadacha1 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
//          int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o'){
                System.out.println('o');
//                sum++;
            }
        }
//        System.out.println(sum);
    }
}
