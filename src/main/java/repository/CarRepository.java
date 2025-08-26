package repository;

import model.Car;
import model.Fuel;

public interface CarRepository extends BaseRepository<Long, Car>{

    void carDetachmentDemo(Long id, Fuel newFuel);
}
