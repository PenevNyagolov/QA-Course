package arrays;

public class max {

    public static void main(String[] args) {
        int[] level = {1,2,3,4,5,6};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < level.length; i++) {
            if (max < level[i]){
                max = level[i];
            }
        }
        System.out.println(max);
    }
}
