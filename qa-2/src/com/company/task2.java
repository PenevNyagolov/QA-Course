package com.company;

public class task2 {
    public static void main(String[] args) {
        int[] level = {1,2,3,4,5,6};
        for (int i = 0; i < level.length; i++) {
            System.out.println(level[i]);
//            System.out.print(level[i]);

        }
        System.out.println();
        System.out.println("===========================================");
        int sum = 0;

        for (int i = 0; i < level.length; i++) {
//        sum = sum + level[i];
        sum += level[i];
        }
        System.out.println("Sum array : " + sum);
    }
}
