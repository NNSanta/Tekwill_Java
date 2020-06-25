package home_oop;

public class CarRun {
    public static void main(String[] args) {
        PassengerCar newcar1 = new PassengerCar();
        AutoTruck newcar2 = new AutoTruck();
        BusClass newcar3 = new BusClass();


        newcar1.typeCar();
        newcar1.colorCar();
        newcar1.speedMaxCar();
        newcar1.priceCar();

        System.out.println();
        newcar2.speedMaxCar();
        newcar2.priceCar();
        newcar2.typeCar();
        newcar2.colorCar();

        System.out.println();
        newcar3.typeCar();
        newcar3.colorCar();
        newcar3.priceCar();
        newcar3.speedMaxCar();


    }

}
