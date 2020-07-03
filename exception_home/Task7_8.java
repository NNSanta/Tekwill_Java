package exception_home;

public class Task7_8 {
    public static void main(String args[])
    {
        try {
            int a = 30, b = 0;
            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);

            String str = null; //null value
            System.out.println(str.charAt(0));

            int array[]=new int[10];
            //array has 0-9 indexes
            array[10] = 9;
            System.out.println("All is good");
        }
        catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException ex) {
            System.out.println ("Can't divide a number by 0");
          //  ex.printStackTrace();
            System.out.println("NullPointerException..");
         //   ex.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException");
           // ex.printStackTrace();
//            System.out.println(ex.getMessage());
        } finally {
            System.out.println();
            System.out.println("Try catch block finished");
        }
    }
}
//почему то продолжают выводиться все ошибки из блока catch, даже если результат входит в зону нормальности