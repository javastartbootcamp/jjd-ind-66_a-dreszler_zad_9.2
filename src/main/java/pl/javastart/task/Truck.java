package pl.javastart.task;

class Truck extends Car {
    private double truckloadWeight;
    private static final double BONUS_FUEL_CONSUMPTION_FROM_AC = 1.6;
    private static final double BONUS_FUEL_CONSUMPTION_PER_100KG_TRUCKLOAD = 0.5;

    public Truck(String name, double fuelTankCapacity, double fuelConsumption, boolean airConditioningOn,
                 double truckloadWeight) {
        super(name, fuelTankCapacity, fuelConsumption, airConditioningOn);
        this.truckloadWeight = truckloadWeight;
    }

    public double getTruckloadWeight() {
        return truckloadWeight;
    }

    public void setTruckloadWeight(double truckloadWeight) {
        this.truckloadWeight = truckloadWeight;
    }

    @Override
    public double getRange() {
        double fuelConsumptionWithTruckload = getFuelConsumption()
                + truckloadWeight / 100 * BONUS_FUEL_CONSUMPTION_PER_100KG_TRUCKLOAD;
        if (isAirConditioningOn()) {
            return getFuelTankCapacity() / (fuelConsumptionWithTruckload + BONUS_FUEL_CONSUMPTION_FROM_AC) * 100;
        } else {
            return getFuelTankCapacity() / fuelConsumptionWithTruckload * 100;
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(", ładunek: %.2f kg", truckloadWeight);
    }
}