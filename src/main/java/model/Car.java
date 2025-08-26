package model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Entity
public class Car extends Vehicle {

    private int seatingCapacity;

    @Enumerated(EnumType.STRING)
    private Fuel fuelType;

    public Car(String brand, VehicleStatus vehicleStatus, Registration registration, LocalDate year, String model, int seatingCapacity, Fuel fuelType) {
        super(brand, vehicleStatus, registration, year, model);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    public Car() {
    }


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
