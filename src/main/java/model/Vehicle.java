package model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Vehicle extends BaseEntity<Long> {

    private String brand;
    private String model;
    private LocalDate year;

    @Embedded
    private Registration registration;

    @Enumerated(EnumType.STRING)
    private VehicleStatus vehicleStatus;

    public Registration getRegisteration() {
        return registration;
    }

    public Vehicle(String brand, VehicleStatus vehicleStatus, Registration registration, LocalDate year, String model) {
        this.brand = brand;
        this.vehicleStatus = vehicleStatus;
        this.registration = registration;
        this.year = year;
        this.model = model;
    }

    public Vehicle(){}

    public void setRegisteration(Registration registration) {
        this.registration = registration;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
