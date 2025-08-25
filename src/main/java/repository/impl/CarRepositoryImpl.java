package repository.impl;

import model.Car;
import repository.CarRepository;

public class CarRepositoryImpl extends BaseRepositoryImpl<Long, Car> implements CarRepository {

    @Override
    public Class<Car> getEntityClass() {
        return Car.class;
    }
}

