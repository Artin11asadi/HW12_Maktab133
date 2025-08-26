package repository.impl;

import model.Vehicle;
import repository.VehicleRepository;


public class VehicleRepositoryImpl extends BaseRepositoryImpl<Long, Vehicle> implements VehicleRepository {

    @Override
    public Class<Vehicle> getEntityClass() {
        return Vehicle.class;
    }
}
