package service.impl;

import model.Car;
import model.Vehicle;
import repository.impl.CarRepositoryImpl;
import service.CarService;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class CarServiceImpl extends BaseServiceImpl<Long, Car, CarRepositoryImpl> implements CarService {

    public CarServiceImpl(CarRepositoryImpl repository) {
        super(repository);
    }

    @Override
    public List<Car> carSeatingAbove(int seatingCapacity) {
        return repository.findAll().stream().filter(car -> car.getSeatingCapacity() > seatingCapacity).toList();
    }

    @Override
    public OptionalDouble averageManfYear() {
        return repository.findAll().stream().mapToInt(vehicle -> vehicle.getYear().getYear()).average();
    }

    @Override
    public Map<String, Long> brandCount() {
        return repository.findAll().stream().collect(Collectors.groupingBy(Vehicle::getBrand, Collectors.counting()));
    }
}
