package util;

import model.Fuel;
import repository.impl.CarRepositoryImpl;
import repository.impl.TruckRepositoryImpl;
import service.CarService;
import service.TruckService;
import service.impl.CarServiceImpl;
import service.impl.TruckServiceImpl;

public class ApplicationContext {

    private static final TruckRepositoryImpl truckRepository;
    private static final CarRepositoryImpl carRepository;
    private static final TruckService truckService;
    private static final CarService carService;


    static {
        truckRepository = new TruckRepositoryImpl();
        carRepository = new CarRepositoryImpl();
        truckService = new TruckServiceImpl(truckRepository);
        carService = new CarServiceImpl(carRepository);
    }

    public static TruckService getTruckService() {
        return truckService;
    }

    public static CarService getCarService(){
        return carService;
    }

    public static void carDetachmentDemo(Long id, Fuel newFuelType){
        carRepository.carDetachmentDemo(id, newFuelType);
    }
}
