package pl.javastart.task;

class Car extends Vehicle {
    private boolean airConditioningOn;
    private static final double BONUS_FUEL_CONSUMPTION_FROM_AC = 0.8;

    public Car(String name, double fuelTankCapacity, double fuelConsumption, boolean airConditioningOn) {
        super(name, fuelTankCapacity, fuelConsumption);
        this.airConditioningOn = airConditioningOn;
    }

    public boolean isAirConditioningOn() {
        return airConditioningOn;
    }

    public void setAirConditioningOn(boolean airConditioningOn) {
        this.airConditioningOn = airConditioningOn;
    }

    public double getRange() {
        if (airConditioningOn) {
            return getFuelTankCapacity() / (getFuelConsumption() + BONUS_FUEL_CONSUMPTION_FROM_AC) * 100;
        } else {
            return getFuelTankCapacity() / getFuelConsumption() * 100;
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(", zasięg: %.2f, klimatyzacja włączona: %b", getRange(),
                isAirConditioningOn());
    }
}
