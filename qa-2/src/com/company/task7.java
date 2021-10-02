package com.company;

public class task7 {
    public static void main(String[] args) {
        int[] level = {200,85,70,95};
        int target = 180;

        for (int i = 0; i < level.length; i++) {
            for (int j = 0; j < level.length; j++) {
                if (level[i] + level[j] == target){
                    System.out.println(level[i]);
                }
            }
        }

    }
}
