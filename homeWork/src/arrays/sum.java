package arrays;

public class sum {
    public static void main(String[] args) {
        int[] level = {1,2,3,4,5,6};
        int sum = 0;
        for (int i = 0; i < level.length; i++) {
            sum = sum + level[i];
        }
        System.out.println(sum);
    }
}
