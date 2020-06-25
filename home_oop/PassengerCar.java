package home_oop;

public class PassengerCar implements Car {
    @Override
    public void typeCar() {
        System.out.println("This is PassengerCar");

    }

    @Override
    public void colorCar() {
        System.out.println("We have only black color");

    }

    @Override
    public int speedMaxCar() {
        System.out.println("Speed Max of PassengerCar is :" +" "+240+" "+"km/hour");
        return 0;
    }

    @Override
    public int priceCar() {
        System.out.println("Max price of PassengerCar is :"+" "+1698756+" "+"$");
        return 0;
    }

    @Override
    public String toString() {
        return "PassengerCar{}";
    }
}
