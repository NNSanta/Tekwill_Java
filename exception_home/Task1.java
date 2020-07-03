package exception_home;

public class Task1 {

    public static void main(String[] args) {
        String[] str = new String[]{"This is string line", "Adam", "Sensei"};

       try {
           System.out.println(str[5]);

       } catch (Exception e){
           System.out.println("Something wrong! Try again!");
           System.out.println();
       } finally {
           System.out.println("I was here!");
           System.out.println("The 'try catch' part of program is finished.");
       }

    }

}
