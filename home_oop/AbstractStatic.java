package home_oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AbstractStatic extends AbstractPhone{

    private static Object status="active";
    private String state;

    public AbstractStatic() {
    }

    @Override
    public void call() {

    }

    @Override
    public void ring() {

    }

    @Override
    public void sms() {

    }

    public AbstractStatic(String state) {
        this.state = state;
    }

    void display(){
        System.out.printf("In %d year was made this phone and it has %s",super.getYear(),status);
    }

    static void dateToStrind() {
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(today);
        System.out.println("Date Format with MM/dd/yyyy : "+strDate);

    }

}
