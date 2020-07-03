package exceprion_home_T2_T3;

public class StartClass {

    public static void main(String args[]) {
        Task2 valid = new Task2();


        try {
            System.out.println(valid.str[7]);

        } catch (Exception ex) {
            System.out.println("Something wrong! Try again!" + ex );
        } finally {
            System.out.println("Try catch block finished");
        }

    }

}
