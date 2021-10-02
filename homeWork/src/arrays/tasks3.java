package arrays;

public class tasks3 {
    public static void main(String[] args) {
        int[] lavel = {2,11,7,154};
        int target = 9;
        for (int i = 0; i < lavel.length; i++) {
            for (int j = 0; j < lavel.length; j++) {
                if (lavel[i] + lavel[j] == target){
                    System.out.println(lavel[i]);
                }
            }
        }
    }
}
