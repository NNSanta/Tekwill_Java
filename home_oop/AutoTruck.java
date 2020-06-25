package home_oop;

public class AutoTruck implements Car{
    @Override
    public void typeCar() {
        System.out.println("This is AutoTruck type of cars");
    }

    @Override
    public void colorCar() {
        System.out.println("We have only white color");
    }

    @Override
    public int speedMaxCar() {
        System.out.println("Speed Max of AutoTruck is :" +" "+160+" "+"km/hour");
        return 0;
    }

    @Override
    public int priceCar() {
        System.out.println("Max price of AutoTruck is :" + " "+2487965+" "+"$");
        return 0;
    }

    @Override
    public String toString() {
        return "AutoTruck{}";
    }
}
