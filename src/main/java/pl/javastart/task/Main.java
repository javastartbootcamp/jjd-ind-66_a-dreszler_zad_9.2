package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Car[] cars = {
            new Car("VW Passat", 100, 10, false),
            new Car("Peugeot 306", 100, 10, false),
            new Truck("Star", 100, 10, false, 1000),
            new Truck("Kamaz", 100, 10, false, 1000)};

        printCarArrayInfo(cars);
        System.out.println("=======================");
        switchAirConditioningForAllCars(cars);
        printCarArrayInfo(cars);
    }

    private static void printCarArrayInfo(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car.getInfo());
        }
    }

    private static void switchAirConditioningForAllCars(Car[] cars) {
        for (Car car : cars) {
            car.setAirConditioningOn(!car.isAirConditioningOn());
        }
    }
}
