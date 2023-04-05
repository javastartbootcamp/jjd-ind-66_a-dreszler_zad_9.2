package pl.javastart.task;

class Car extends Vehicle {
    protected boolean airConditioningOn;
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

    @Override
    public double calculateFuelConsumption() {
        if (airConditioningOn) {
            return baseFuelConsumption + getAcConsumption();
        }
        return baseFuelConsumption;
    }

    protected double getAcConsumption() {
        return BONUS_FUEL_CONSUMPTION_FROM_AC;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(", zasięg: %.2f, klimatyzacja włączona: %b, zużycie z klimą: %.2f",
                getRange(), isAirConditioningOn(), calculateFuelConsumption());
    }
}
