package com.company;

public class tasc4 {
    public static void main(String[] args) {
        int[] level = {1,2,4,5,5,6};
        for (int i = 0; i < level.length; i++) {
            if(level[i] != i + level[0]){
                System.out.println(level[i]);
            }
        }
    }
}
