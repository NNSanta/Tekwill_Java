package home_oop;

public class SavingAccount extends Account{

    private double interest;
    public SavingAccount(int num, double interest) {
        super(num);
        this.interest=interest;
    }

    public double getInterest() {
       double interestBaseOnMoney = interest*getBalance();
        return interestBaseOnMoney;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }


    //method adding interest

    public void addInerest(){
    double save = interest*super.getBalance() + getBalance();
    super.deposit(save);
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interest=" + interest +
                "} " + super.toString();
    }
}
