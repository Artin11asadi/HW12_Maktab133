package service.impl;

import model.Vehicle;
import repository.impl.VehicleRepositoryImpl;

public class VehicleServiceImpl extends BaseServiceImpl<Long, Vehicle, VehicleRepositoryImpl> {

    public VehicleServiceImpl(VehicleRepositoryImpl repository) {
        super(repository);
    }
}
