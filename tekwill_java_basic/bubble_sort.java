package tekwill_java_basic;

public class bubble_sort {


    public static void main(String[] args) {


        int[] array = {3, 9, 2, 1, 5, 7, 6, 10, 4, 8};
        int temp;
        int pass = 0;
        System.out.println("Input array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
             pass++;
        }
        System.out.println("\n\nSorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
         System.out.println("\n\nNumbers of passes :" + pass);
        //pass - количество проходов. те довели одну цифру до конца - начинаем с другой
    }
}
