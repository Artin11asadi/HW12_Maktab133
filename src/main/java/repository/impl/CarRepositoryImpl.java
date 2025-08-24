package repository.impl;

import model.Vehicle;

public class CarRepositoryImpl extends VehicleRepositoryImpl{
    public CarRepositoryImpl(Class<Vehicle> entityClass) {
        super(entityClass);
    }
}
