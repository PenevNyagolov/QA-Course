package metodAndSolving;

public class tasks2 {
    public static void main(String[] args) {
        task1();
    }
    public static void task1(){
        int[][] values = {
                {15,-12,7},
                {22,0},
                {199,-200,-4,22}
        };
        int max = values[0][0];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] > max){
                    max = values[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
