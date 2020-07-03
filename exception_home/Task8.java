package exception_home;

public class Task8 {
    public static void main(String args[])
    {
        try{
            int a[]=new int[10];
            //array has 0-9 indexes
            a[10] = 9;
            System.out.println("All is good");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("This is error! ArrayIndexOutOfBounds");

        }
    }
}
