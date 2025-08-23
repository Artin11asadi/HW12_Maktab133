package model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Inheritance
public abstract class Vehicle extends BaseEntity<Long> {

    private String brand;
    private String model;
    private LocalDate year;


    @Embedded
    private Registeration registeration;

    @Enumerated(EnumType.STRING)
    private VehicleStatus vehicleStatus;

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
