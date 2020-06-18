package tekwill_java_basic;

public class Duplicate {
    public static void main(String[] args) {
        int[] array = {3, 9, 2, 1, 5, 7, 6, 10, 4, 8};
        int[] result = new int[array.length];
        int temp;
        // int pass = 0;
        System.out.println("Input array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (array[i] == array[j] && i != j) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }

        }


    }
}


