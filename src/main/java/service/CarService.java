package service;

import model.Car;
import model.Vehicle;

import java.util.List;

public interface CarService extends VehicleService<Long, Car> {

    List<Car> carSeatingAbove(int seatingCapacity);


}
