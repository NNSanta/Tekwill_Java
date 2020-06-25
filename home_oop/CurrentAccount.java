package home_oop;

public class CurrentAccount extends Account {
     private double limit;

    public CurrentAccount(int num, double limit) {
        super(num);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public void withdraw () {
        if (limit <= this.limit) {
            super.withdraw(limit);
        } else
        System.out.println("Sorry, Your limit Exceeded");

    }


    @Override
    public String toString() {
        return "CurrentAccount{" +
                "limit=" + limit +
                "} " + super.toString();
    }
}
