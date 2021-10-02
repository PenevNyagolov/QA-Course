package arrays;

import java.util.Arrays;

public class tasks2 {
    public static void main(String[] args) {
        int[] array = {3,4,5};
        int[] array2 = {6,7,8};
        int[] result = new int[array.length + array2.length];

        for (int i = 0; i < result.length; i++) {
            if (i < array.length){
                result[i] = array[i];
            }else{
                result[i] = array2[i - array.length];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
