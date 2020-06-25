package home_oop;

public class AbstractOldPhone extends AbstractPhone {
    public AbstractOldPhone(String samsung) {
    }

    public AbstractOldPhone() {
    }

    @Override
    public void call() {
        System.out.println("Old phone can call");
    }

    @Override
    public void ring() {
        System.out.println("Old phone has ring");
    }

    @Override
    public void sms() {
        System.out.println("Old phone can write sms");
    }
}
