package com.company;

import java.util.Arrays;

public class tasc1 {
    public static void main(String[] args) {

//        int[] arr = {1,2,3,4,5,6,7};
        int[] arr = new int[5];
        System.out.println(" First array : "+ Arrays.toString(arr));
        arr[3] = 5;
        System.out.println(Arrays.toString(arr));

        int[] a = {3,4,5,6};
        int[] b = {6,7,8,9};
        int[] result = new int[a.length + b.length];
        System.out.println(Arrays.toString(result));

        for (int i = 0; i < result.length; i++) {
            if (i < a.length){
                result[i] = a[i];
            }else {
                result[i] = b[i - a.length];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
