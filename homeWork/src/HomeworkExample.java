import java.util.Arrays;

public class HomeworkExample {

    public static void main(String[] args) {

        //task1();
        //task2();
        //task3();
        //task4();

        boolean isPresent = hasElement(new int[]{1, 2, 3, 4, 5}, 3);
        System.out.println(isPresent);

    }

    // Вложенные циклы
    public static void task1() {

        int[][] values = { {15,  7}, {22}, {199, -200, 22} };

        int max = values[0][0];

        for (int i = 0; i < values.length; i++) {

            int[] innerArray = values[i];

            System.out.println("Length of inner array " + i + ": " + innerArray.length);

            for (int j = 0; j < innerArray.length; j++) {

                if (innerArray[j] > max) {
                    max = innerArray[j];
                }

            }

        }

        System.out.println("Final Result: " + max);

    }

    public static void task2() {
        //
        System.out.println("Ура я в новом методе!");
        int number1 = 897654;
        String var1 = Integer.toString(number1);
        System.out.println(Arrays.toString(var1.split("")));


    }

    //Задача №7
    //Дан массив:
    //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    //необходимо вывести количество элементов в массиве.
    public static void task3() {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int numberOfElements = 0;
        int numberOfOuterElements = 0;
        int innerElementsPerArray = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                numberOfElements += 1;
                innerElementsPerArray += 1;
            }
            numberOfOuterElements += 1;

            System.out.println("Elements in inner array: "+ innerElementsPerArray);

            innerElementsPerArray = 0;

        }
        System.out.println(numberOfElements);
        System.out.println(numberOfOuterElements);

    }

    public static void task4() {

        int[] array = {1, 2, 3, 4, 5};
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result = result + 1;
        }

    }

    public static boolean hasElement(int[] array, int value) {

        boolean hasFound = false;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {
                hasFound = true;
                break;
            }

        }
        return hasFound;

    }


}