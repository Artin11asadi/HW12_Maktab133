package model;

import jakarta.persistence.Embeddable;

import java.time.LocalDate;

@Embeddable
public class Registeration {

    private String plateNumber;
    private LocalDate registrationDate;
    private RegistrationState state;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public RegistrationState getState() {
        return state;
    }

    public void setState(RegistrationState state) {
        this.state = state;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
