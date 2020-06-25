package home_oop;

public class RodentRun {
    public static void main(String[] args) {

        Rodent rod [] = new Rodent[4];
        rod [0] = new Rodent();
        rod [1] =new Mouse();
        rod [2] = new Gerbil();
        rod [3] = new Hamster();

        rod [0].eat();
        rod [0].drink();
        rod [0].run();
        rod [0].sleep();
        System.out.println();

        rod [1].eat();
        rod [1].drink();
        rod [1].run();
        rod [1].sleep();
        System.out.println();

        rod [2].eat();
        rod [2].drink();
        rod [2].run();
        rod [2].sleep();
        System.out.println();

        rod [3].eat();
        rod [3].drink();
        rod [3].run();
        rod [3].sleep();


    }
}
