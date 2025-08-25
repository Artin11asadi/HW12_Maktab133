package service;

import model.Truck;

import java.util.List;

public interface TruckService extends VehicleService<Long, Truck> {

    List<Truck> loadCapacityAbove(int loadCapacity);
}
