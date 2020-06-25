package home_oop;

public class AbsrtactSmartPhone extends AbstractPhone {
    @Override
    public void call() {
        System.out.println("Smart phone can call");
    }

    @Override
    public void ring() {
        System.out.println("Smart phone can ring");
    }

    @Override
    public void sms() {
        System.out.println("Smart phone can write sms");
    }
}
