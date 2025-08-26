package model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Embeddable
public class Registration {

    private String plateNumber;
    private LocalDate registrationDate;
    @Enumerated(value = EnumType.STRING)
    private RegistrationState state;

    public Registration(String plateNumber, RegistrationState state, LocalDate registrationDate) {
        this.plateNumber = plateNumber;
        this.state = state;
        this.registrationDate = registrationDate;
    }

    public Registration() {}

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
