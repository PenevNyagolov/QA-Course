package com.company;

public class tasc3 {
    public static void main(String[] args) {
        int[] level = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < level.length; i++) {
            if (level[i] % 2 == 0){
                System.out.println("Cheten : " + level[i]);
            }
        }
        System.out.println("=========================================");
        for (int i = 0; i < level.length; i++) {
            if (level[i] % 2 != 0){
                System.out.println("Nechete : " + level[i]);
            }
        }
        System.out.println("===================================");
        for (int i = 0; i < level.length; i++) {
            if (i % 2 == 0){
                System.out.println("Cheten index : " + i  + " = " + level[i]);
            }
        }
        System.out.println("=========================================");
        for (int i = 0; i < level.length; i++) {
            if (i % 2 != 0){
                System.out.println("Nechete index : " + i + " = " + level[i]);
            }
        }
    }
}
