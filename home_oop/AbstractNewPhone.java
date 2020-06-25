package home_oop;

public class AbstractNewPhone extends AbstractPhone {

    @Override
    public void call() {
        System.out.println("New phone can call");
    }

    @Override
    public void ring() {
        System.out.println("New phone can ring");
    }

    @Override
    public void sms() {
        System.out.println("New phone can write sms");
    }
}
