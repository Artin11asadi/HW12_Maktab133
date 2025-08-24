package repository.impl;

import model.Vehicle;


public class VehicleRepositoryImpl extends BaseRepositoryImpl<Long, Vehicle> {

    public VehicleRepositoryImpl(Class<Vehicle> entityClass) {
        super(entityClass);
    }
}
