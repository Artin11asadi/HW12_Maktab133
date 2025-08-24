package repository.impl;

import model.Vehicle;

public class TruckRepositoryImpl extends VehicleRepositoryImpl{
    public TruckRepositoryImpl(Class<Vehicle> entityClass) {
        super(entityClass);
    }
}
