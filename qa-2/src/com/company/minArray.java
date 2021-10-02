package com.company;

public class minArray {
    public static void main(String[] args) {

        int[] level = {1,2,3,4,5,6,7,8,9};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < level.length; i++) {
            if (min > level[i]){
                min = level[i];
            }
        }
        System.out.println(min);
    }
}
