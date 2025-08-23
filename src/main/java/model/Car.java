package model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Car extends Vehicle{

    private int seatingCapacity;

    @Enumerated(EnumType.STRING)
    private Fuel fuelType;

    public Fuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
}
