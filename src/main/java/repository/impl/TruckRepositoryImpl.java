package repository.impl;

import model.Truck;
import model.Vehicle;
import repository.TruckRepository;
import service.impl.BaseServiceImpl;

public class TruckRepositoryImpl extends BaseRepositoryImpl<Long, Truck> implements TruckRepository {

    @Override
    public Class<Truck> getEntityClass() {
        return Truck.class;
    }
}
