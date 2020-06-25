package home_oop;

public class BusClass implements Car {
    @Override
    public void typeCar() {
        System.out.println("This is Bus type of cars");
    }

    @Override
    public void colorCar() {
        System.out.println("We have only red color");
    }

    @Override
    public int speedMaxCar() {
        System.out.println("Speed Max of Bus is :"+" "+140+" "+"km/hour");
        return 0;
    }

    @Override
    public int priceCar() {
        System.out.println("Max price of Bus is :"+" "+3487788+" "+"$");
        return 0;
    }

    @Override
    public String toString() {
        return "BusClass{}";
    }
}
