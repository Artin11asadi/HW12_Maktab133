package service.impl;

import model.Truck;
import model.Vehicle;
import repository.impl.TruckRepositoryImpl;
import service.TruckService;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class TruckServiceImpl extends BaseServiceImpl<Long, Truck, TruckRepositoryImpl> implements TruckService {

    public TruckServiceImpl(TruckRepositoryImpl repository) {
        super(repository);
    }

    @Override
    public List<Truck> loadCapacityAbove(int loadCapacity) {
        return repository.findAll().stream().filter(truck -> truck.getLoadCapacity() > loadCapacity).toList();
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
