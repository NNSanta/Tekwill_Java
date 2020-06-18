package tekwill_java_basic;
public class MinimumDistance {

    public static void main(String[] args) {


        int[] numbers = {11, 7, 4, 7, 9, 1, 10, 33, 44, 1};
        int index = 0;

        for (int i = 1; i < numbers.length - 1; i++) {
            if (Math.abs(numbers[index] - numbers[index + 1]) >
                    Math.abs(numbers[i] - numbers[i + 1])) {
                index = i;
            }


        }
        System.out.println(index);



    }
}


