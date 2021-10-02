package com.company;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6};
        int[] b = new int[]{7,8,9,10};
        int[][] c = {a,b};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.deepToString(c));
        
//        for (int i = 0; i < level.length; i++) {
//            if(level[i] != i + level[0]){
//                System.out.println(level[i]);
//            }
//        }
    }
}
