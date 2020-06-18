package tekwill_java_basic;



public class Christmas_tree {
    public static void main(String[] args) {


        for (int i = 0; i < 20; i++) { // number of rows
            for (int j = 0; j < 20 - i; j++) //number of spaces
                //первая печать 20 пробелов
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++) ///number of stars
                //первая печать 1 звездочка
                System.out.print("*");
            System.out.println();
        }
    }

    }
