package com.company;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class task6 {
    public static void main(String[] args) {
        int[][] level = {{1,2,3,4,5,6},{7,8,9,10,11}};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < level.length; i++) {
            for (int j = 0; j < level[i].length; j++) {
                if (level[i][j] > max){
                    max = level[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
