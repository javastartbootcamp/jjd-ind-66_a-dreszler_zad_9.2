package pl.javastart.task;

class Vehicle {
    private String name;
    private double fuelTankCapacity;
    private double fuelConsumption;

    public Vehicle(String name, double fuelTankCapacity, double fuelConsumption) {
        this.name = name;
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelConsumption = fuelConsumption;
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

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getRange() {
        return fuelTankCapacity / fuelConsumption * 100;
    }

    public String getInfo() {
        return String.format("Nazwa: %s, pojemność baku: %.2f l, zużycie paliwa na 100 km: %.2f", name,
                fuelTankCapacity, fuelConsumption);
    }
}
