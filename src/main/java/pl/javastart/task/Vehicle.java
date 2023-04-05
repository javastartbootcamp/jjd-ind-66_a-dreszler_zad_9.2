package pl.javastart.task;

class Vehicle {
    private String name;
    protected double fuelTankCapacity;
    protected double baseFuelConsumption;

    public Vehicle(String name, double fuelTankCapacity, double baseFuelConsumption) {
        this.name = name;
        this.fuelTankCapacity = fuelTankCapacity;
        this.baseFuelConsumption = baseFuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public double getBaseFuelConsumption() {
        return baseFuelConsumption;
    }

    public void setBaseFuelConsumption(double baseFuelConsumption) {
        this.baseFuelConsumption = baseFuelConsumption;
    }

    public double calculateFuelConsumption() {
        return baseFuelConsumption;
    }

    public double getRange() {
        return fuelTankCapacity / calculateFuelConsumption() * 100;
    }

    public String getInfo() {
        return String.format("Nazwa: %s, pojemność baku: %.2f l, bazowe zużycie paliwa na 100 km: %.2f", name,
                fuelTankCapacity, baseFuelConsumption);
    }
}
