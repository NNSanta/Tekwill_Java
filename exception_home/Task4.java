package exception_home;

public class Task4 {

    private static String str = null;
    public static void main(String[] args) {

        try {
            System.out.println(str.toString());
        } catch(NullPointerException e) {
            System.out.println("-----Caught NullPointerException");
           // e.printStackTrace();
        }
        try {
            str = "Is not empty";
            System.out.println(str.toString());
        } catch(NullPointerException e) {
            System.out.println("Caught NullPointerException");
          //  e.printStackTrace();
        } finally {
            System.out.println("Block try catch finished");
        }
    }

}
