public class J2DArrays {
    public static void main(String[] args) {

//  1. 2D Arrays Declaration
//      Primitive
//
//        int[][] array2D_1;
//        double[][] array2D_2;
//        boolean[][] array2D_3;
//        char[][] array2D_4;
//
//      Objects/Reference
//
//        String[][] array2D_5;
//        Integer[][] array2D_6;
//        Teacher[][] array2D_7;
//        Cats[][] cats2D;
//
//  2. 2D Arrays Memory allocation
//        array2D_1 = new int[2][3];
//        array2D_2 = new double[10][20];
//        array2D_3 = new boolean[5][100];
//        array2D_4 = new char[3][3];
//        array2D_5 = new String[2][8];
//
//  3. 2D Arrays Initializers

//        int[][] array2D = new int[2][3];
//
//        array2D[0][0] = 1;
//        array2D[0][1] = 2;
//        array2D[0][2] = 3;
//        array2D[1][0] = 100;
//        array2D[1][1] = 200;
//        array2D[1][2] = 300;
//        __________________________________________
//
//        String[][] cats = {{"Мурка", "Мурзик", "Рыжик"}, {"Черныш", "Васька", "Зорро"}};
//        __________________________________________
//
//        boolean[][] isCatBlack = new boolean[][]{{false, true}, {false, false}};
//        __________________________________________
//

        String[] catsNames = new String[8];

        catsNames[0] = "Мурзик";
        catsNames[1] = "Черныш";
        catsNames[2] = "Мурка";
        catsNames[3] = "Барсик";
        catsNames[4] = "Рыжик";
        catsNames[5] = "Эшли";
        catsNames[6] = "Джина";
        catsNames[7] = "Машка";

        int[] catsAges = {2, 3, 4, 1, 5, 6, 9, 10};

        String[] catsColors = new String[8];

        catsColors[0] = "Grey";
        catsColors[1] = "Black";
        catsColors[2] = "Grey";
        catsColors[3] = "Brown";
        catsColors[4] = "Red";
        catsColors[5] = "Grey";
        catsColors[6] = "Red";
        catsColors[7] = "Grey";

        //min value
        int min = 1000;
        for (int boxNumber = 0; boxNumber < catsAges.length; boxNumber++) {
            if (catsAges[boxNumber]< min) {
                min = catsAges[boxNumber];
            }
        }
        System.out.println(min);

        //max value
        int max = 0;
        for (int boxNumber = 0; boxNumber < catsAges.length; boxNumber++) {
            if (catsAges[boxNumber] > max) {
                max = catsAges[boxNumber];
            }
        }
        System.out.println(max);

        //average
        int result = 0;
        for (int boxNumber = 0; boxNumber < catsAges.length; boxNumber++) {
            result = result + catsAges[boxNumber];
        }
        System.out.println(result/catsAges.length);

        //int[] to String[]
        String[] catsAgesString = new String[8];

        for (int boxNumber = 0; boxNumber < catsAges.length; boxNumber++) {
            catsAgesString[boxNumber] = String.valueOf(catsAges[boxNumber]);
            System.out.println(catsAgesString[boxNumber]);
        }
        System.out.println(catsAgesString[0].getClass());
        System.out.println(catsAges[0]);

        //to be sure int not equals String
        if (catsAgesString[0].equals(catsAges[0])) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //String to int
        String numberString = "1";
        int number = 1;

        int numberInt = Integer.parseInt(numberString);

        System.out.println(numberInt);
        System.out.println(numberString);
        System.out.println(number);

        if(number == numberInt) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //String to double
        double numberDouble = Double.parseDouble(numberString);
        System.out.println(numberDouble);

        //String[] to int[]

//        int[] catsAgesInt = new int[8];
//
//        for (int i = 0; i < catsAgesString.length; i++) {
//            catsAgesInt[i] = Integer.parseInt(catsAgesString[i]);
//            System.out.println(catsAgesInt[i]);
//        }

//        //2D array
//        String[][] cats = new String[3][8];
//
//        for (int row = 0; row < 3; row ++) {
//            for (int cell = 0; cell < 8; cell ++) {
//                if (row == 0) {
//                    cats[row][cell] = catsNames[cell];
//                } else if (row == 1) {
//                    cats[row][cell] = catsAgesString[cell];
//                } else if (row == 2) {
//                    cats[row][cell] = catsColors[cell];
//                }
//                System.out.print(cats[row][cell]);
//                System.out.println();
//            }
//        }
//
//        //Another ways to create 2D array of Strings cats1[3][8]
//        String[][] cats1 = {{"Мурзик", "Черныш", "Мурка", "Барсик", "Рыжик", "Эшли", "Джина", "Машка"},
//                            {"2", "3", "4", "1", "5", "6", "9", "10"},
//                            {"Grey", "Black", "Grey", "Brown", "Red", "Grey", "Red", "Grey"}};
//
//        String[][] cats2 = new String[3][8];
//        cats[0][0] = "Мурзик";
//        cats[1][0] = "2";
//        cats[2][0] = "Grey";
//        cats[0][1] = "Черныш";
//        cats[1][1] = "3";
//        cats[2][1] = "Black";
//        // и так далее до последнего кота
//        cats[0][7] = "Машка";
//        cats[1][7] = "10";
//        cats[2][1] = "Grey";
//
//        //print cats business cards
//        System.out.println("_____________________________________");
//
//        for (int cell = 0; cell < 8; cell ++) {
//            for (int row = 0; row < 3; row ++) {
//                System.out.println(cats[row][cell]);
//            }
//            System.out.println("_____________________________________");
//        }
//
//        // Рыжик  cats[0][4], cats[1][4], cats[2][4]
//
//        //print "Рыжик" from 1D array
//        System.out.println(catsNames[4]);
//
//        //print business card for Рыжик
//        System.out.println(cats[0][4] + ", " + cats[1][4] + ", " + cats[2][4]);
//
//        System.out.println("____________________________________");
//
//        //print "cool" business card for Рыжик
//        System.out.print("Кот " + cats[0][4] + ", " + cats[1][4]);
//        if (cats[1][4].equals("2") || cats[1][4].equals("3")
//                || cats[1][4].equals("4")) {
//            System.out.print(" года, color ");
//        } else if (cats[1][4].equals("1")) {
//            System.out.print(" год, color ");
//        } else {
//            System.out.print(" лет, color ");
//        }
//        System.out.println(cats[2][4]);
    }
}