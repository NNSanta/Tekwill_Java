package home_oop;

public class AbstractRun {
    public static void main(String[] args) {
AbstractOldPhone old = new AbstractOldPhone("Samsung");
    old.call();
    old.description();
        System.out.println();

        AbstractNewPhone new1 = new AbstractNewPhone();
        new1.call();
        new1.sms();
        System.out.println();

        AbsrtactSmartPhone smart = new AbsrtactSmartPhone();
        smart.ring();
        smart.sms();
        System.out.println();

        AbstractStatic static1 = new AbstractStatic();
        static1.display();
        static1.getYear();
        System.out.println();
        static1.dateToStrind();

    }
}
