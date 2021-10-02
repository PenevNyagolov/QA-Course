package metodAndSolving;

import java.util.Arrays;

public class tasks3 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        boolean isPresent = hasElement(a,5);
        System.out.println(isPresent);
    }
    public static boolean hasElement(int[] array, int value){
        boolean hasFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                hasFound = true;
                break;
            }

        }
        return hasFound;
    }
}
