package model;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Truck extends Vehicle {

    private Double loadCapacity;

    private int numberOfAxles;

    public Truck(String brand, VehicleStatus vehicleStatus, Registration registration, LocalDate year, String model, Double loadCapacity, int numberOfAxles) {
        super(brand, vehicleStatus, registration, year, model);
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    public Truck() {
    }

    public Double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }


}
