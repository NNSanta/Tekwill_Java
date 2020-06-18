package tekwill_java_basic;
import java.util.Arrays;
import java.util.regex.Pattern;

public class String_array {

    public static void main(String[] args) {
        //using String split function
        String input = "Alloha, it's a good time ";
        String [] convertInput = null;

        convertInput = input.split(",");
        System.out.println(Arrays.toString(convertInput));

        //using java.util.regex Pattern
        Pattern pattern = Pattern.compile(",");
        convertInput = pattern.split(input);
        System.out.println(Arrays.toString(convertInput));
        
    }
    
}
