public class GFor {

//    for (type i = start condition; i stop condition; i step) {
//        code;
//    }
//
//    exit;
//----------------------------------
//0 <= number <= 10; print all numbers;
//    for (int i = 0; i < 11; i++) {
//        System.out.println(i);
//    }

    public static void main(String[] args) {

        //1st edition

        //int beerBottlesCount = 99;
//        for (int beerBottlesCount = 99; beerBottlesCount >= 0; beerBottlesCount--) {
//
//            if (beerBottlesCount == 0) {
//                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
//
//                System.out.print("Go to the store and buy some more, ");
//                beerBottlesCount = 99;
//                System.out.println(beerBottlesCount + " bottles of beer on the wall.");
//                System.out.println();
//                break;
//            }
//            if(beerBottlesCount == 1) {
//                System.out.print(beerBottlesCount + " bottle of beer on the wall, ");
//                System.out.println(beerBottlesCount + " bottle of beer on the wall, ");
//                System.out.print("Take one down and pass it around, ");
//                System.out.println("no more bottles of beer on the wall.");
//                System.out.println();
//                continue;
//            }
//            if(beerBottlesCount == 2) {
//                System.out.print(beerBottlesCount + " bottles of beer on the wall, ");
//                System.out.println(beerBottlesCount + " bottles of beer.");
//                System.out.print("Take one down and pass it around, ");
//                System.out.println(beerBottlesCount - 1 + " bottle of beer on the wall.");
//                System.out.println();
//                continue;
//            }
//
//
//            System.out.print(beerBottlesCount + " bottles of beer on the wall, ");
//            System.out.println(beerBottlesCount + " bottles of beer.");
//            System.out.print("Take one down and pass it around, ");
//            System.out.println(beerBottlesCount - 1 + " bottles of beer on the wall.");
//            System.out.println();
//        }

//        for (int beerBottlesCount = 99; beerBottlesCount >= 0; beerBottlesCount--) {
//
//            if (beerBottlesCount == 0) {
//                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
//
//                System.out.print("Go to the store and buy some more, ");
//
//                System.out.println("99 bottles of beer on the wall.");
//                System.out.println();
//            } else if (beerBottlesCount == 1) {
//                System.out.print(beerBottlesCount + " bottle of beer on the wall, ");
//                System.out.println(beerBottlesCount + " bottle of beer on the wall, ");
//                System.out.print("Take one down and pass it around, ");
//                System.out.println("no more bottles of beer on the wall.");
//                System.out.println();
//                //continue;
//            } else if (beerBottlesCount == 2) {
//                System.out.print(beerBottlesCount + " bottles of beer on the wall, ");
//                System.out.println(beerBottlesCount + " bottles of beer.");
//                System.out.print("Take one down and pass it around, ");
//                System.out.println(beerBottlesCount - 1 + " bottle of beer on the wall.");
//                System.out.println();
//                //continue;
//            } else {
//                System.out.print(beerBottlesCount + " bottles of beer on the wall, ");
//                System.out.println(beerBottlesCount + " bottles of beer.");
//                System.out.print("Take one down and pass it around, ");
//                System.out.println(beerBottlesCount - 1 + " bottles of beer on the wall.");
//                System.out.println();
//            }
//        }

//        String bottlesOfBeer = " bottles of beer";
//        String onTheWall = " on the wall";
//        String dot = ". ";
//
//        for (int beerBottlesCount = 99; beerBottlesCount >= 0; beerBottlesCount--) {
//
//            if (beerBottlesCount == 0) {
//                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
//
//                System.out.print("Go to the store and buy some more, ");
//                beerBottlesCount = 99;
//                System.out.println(beerBottlesCount + " bottles of beer on the wall.");
//                System.out.println();
//                break;
//            } else if (beerBottlesCount == 1) {
//                System.out.print(beerBottlesCount + " bottle of beer on the wall, ");
//                System.out.println(beerBottlesCount + " bottle of beer on the wall, ");
//                printTakeOneDown();
//                System.out.println("no more bottles of beer on the wall.");
//                System.out.println();
//                //continue;
//            } else if (beerBottlesCount == 2) {
//                System.out.print(beerBottlesCount + " bottles of beer on the wall, ");
//                System.out.println(beerBottlesCount + " bottles of beer.");
//                printTakeOneDown();
//                System.out.println(beerBottlesCount - 1 + " bottle of beer on the wall.");
//                System.out.println();
//                //continue;
//            } else {
//                print(beerBottlesCount);
//                print(bottlesOfBeer);
//                print(onTheWall);
//                printComaSpace();
//                print(beerBottlesCount);
//                print(bottlesOfBeer);
//                printDot();
//                println();
//                printTakeOneDown();
//                print(beerBottlesCount - 1);
//                print(bottlesOfBeer);
//                print(onTheWall);
//                print(dot);
//                println();
//                println();
//            }
//        }
//    }
//
//
//    private static void println() {
//        System.out.println();
//    }
//
//    private static void printTakeOneDown() {
//        System.out.print("Take one down and pass it around, ");
//    }
//
//    private static void print(String string) {
//        System.out.print(string);
//    }
//
//    private static void printDot() {
//        System.out.print(". ");
//    }
//
//    private static void printComaSpace() {
//        System.out.print(", ");
//    }
//
//    private static void print(int number) {
//        System.out.print(number);
//    }

        String bottlesOfBeer = " bottles of beer";
        String onTheWall = " on the wall";
        String oneDown = "Take one down and pass it around";
        String noMore = "No more";
        String dot = ".";
        String commaSpace = ", ";

        for (int beerBottlesCount = 99; beerBottlesCount >= 0; beerBottlesCount--) {

            if (beerBottlesCount == 0) {
                print(noMore);
                print(bottlesOfBeer);
                print(onTheWall);
                print(commaSpace);
                print(toLowerCase(noMore));
                print(bottlesOfBeer);
                print(dot);
                println();
                print("Go to the store and buy some ");
                print(getFourLastLetters(noMore));
                print(commaSpace);

                beerBottlesCount = 99;

                print(beerBottlesCount);
                print(bottlesOfBeer);
                print(onTheWall + dot);
                println();
                break;
            } else if (beerBottlesCount == 1) {
                print(beerBottlesCount);
                print(removeSLetter(bottlesOfBeer));
                print(onTheWall);
                print(commaSpace);
                print(beerBottlesCount);
                print(removeSLetter(bottlesOfBeer));
                print(dot);
                println();
                print(oneDown);
                print(commaSpace);
                print(toLowerCase(noMore));
                print(bottlesOfBeer);
                print(onTheWall);
                print(dot);
                println();
                println();
            } else if (beerBottlesCount == 2) {
                print(beerBottlesCount);
                print(bottlesOfBeer);
                print(onTheWall);
                print(commaSpace);
                print(beerBottlesCount);
                print(bottlesOfBeer);
                print(dot);
                println();
                print(oneDown);
                print(commaSpace);
                print(beerBottlesCount - 1);
                print(removeSLetter(bottlesOfBeer));
                print(onTheWall);
                print(dot);
                println();
                println();
            } else {
                print(beerBottlesCount);
                print(bottlesOfBeer);
                print(onTheWall);
                print(commaSpace);
                print(beerBottlesCount);
                print(bottlesOfBeer);
                print(dot);
                println();
                print(oneDown);
                print(commaSpace);
                print(beerBottlesCount - 1);
                print(bottlesOfBeer);
                print(onTheWall);
                print(dot);
                println();
                println();
            }
        }
    }

    private static void println() {
        System.out.println();
    }

    private static void print(String string) {
        System.out.print(string);
    }

    private static void print(int number) {
        System.out.print(number);
    }

    private static String toLowerCase(String string) {
        String newString = string.toLowerCase();
        return newString;
    }

    private static String removeSLetter(String string) {
        String newString = string.replace("s", "");
        return newString;
    }

    private static String getFourLastLetters (String string) {
        if (string.length() >= 4) {
            //System.out.println(string.substring(0, 2));
            return string.substring(string.length() - 4);
        }
        return null;
    }
}
