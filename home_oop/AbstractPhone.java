package home_oop;

public abstract  class AbstractPhone {
    private int year=2006;

    public AbstractPhone() {
    }

    public AbstractPhone(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void call ();
    public abstract void ring ();
    public abstract void sms ();

    public void description(){
        System.out.println("This is a phone (without abstract)");
    }

}
