import model.*;
import util.ApplicationContext;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Registration registration1 = new Registration(
                "TES001",
                RegistrationState.ACTIVE,
                LocalDate.of(2024, 1, 15)
        );

        Car car1 = new Car(
                "Tesla",
                VehicleStatus.ACTIVE,
                registration1,
                LocalDate.of(2024, 1, 1),
                "Model S",
                5,
                Fuel.ELECTRIC
        );

        Registration registration2 = new Registration(
                "FRD002",
                RegistrationState.INACTIVE,
                LocalDate.of(2023, 11, 20)
        );

        Car car2 = new Car(
                "Ford",
                VehicleStatus.MAINTENANCE,
                registration2,
                LocalDate.of(2023, 10, 15),
                "F-150",
                6,
                Fuel.GAS
        );

        Registration registration3 = new Registration(
                "TOY003",
                RegistrationState.EXPIRED,
                LocalDate.of(2022, 8, 10)
        );

        Car car3 = new Car(
                "Ford",
                VehicleStatus.INACTIVE,
                registration3,
                LocalDate.of(2022, 7, 1),
                "Prius",
                5,
                Fuel.HYBRID
        );

        Registration registration4 = new Registration(
                "CHE004",
                RegistrationState.PENDING,
                LocalDate.of(2024, 2, 5)
        );

        Car car4 = new Car(
                "Chevrolet",
                VehicleStatus.ACTIVE,
                registration4,
                LocalDate.of(2024, 1, 20),
                "Silverado",
                8,
                Fuel.DIESEL
        );

        Registration registration5 = new Registration(
                "SL213",
                RegistrationState.ACTIVE,
                LocalDate.of(2025, 1, 2));

        Truck truck1 = new Truck(
                "Slate",
                VehicleStatus.MAINTENANCE,
                registration5,
                LocalDate.of(2023, 11, 4),
                "TRUCK1",
                1234.0,
                2
        );

        Registration registration6 = new Registration(
                "TRK456",
                RegistrationState.ACTIVE,
                LocalDate.of(2024, 3, 15));

        Truck truck2 = new Truck(
                "Volvo",
                VehicleStatus.ACTIVE,
                registration6,
                LocalDate.of(2022, 5, 20),
                "VNL860",
                18500.0,
                3
        );

        Registration registration7 = new Registration(
                "HTR789",
                RegistrationState.PENDING,
                LocalDate.of(2024, 6, 1));

        Truck truck3 = new Truck(
                "Peterbilt",
                VehicleStatus.ACTIVE,
                registration7,
                LocalDate.of(2023, 8, 12),
                "579",
                15875.5,
                2
        );

        Registration registration8 = new Registration(
                "MGT012",
                RegistrationState.INACTIVE,
                LocalDate.of(2023, 12, 10));

        Truck truck4 = new Truck(
                "Mack",
                VehicleStatus.INACTIVE,
                registration8,
                LocalDate.of(2021, 2, 28),
                "Anthem",
                14200.0,
                3
        );

        ApplicationContext.getCarService().saveOrUpdate(car1);
        ApplicationContext.getCarService().saveOrUpdate(car2);
        ApplicationContext.getCarService().saveOrUpdate(car3);
        ApplicationContext.getCarService().saveOrUpdate(car4);
        ApplicationContext.getTruckService().saveOrUpdate(truck1);
        ApplicationContext.getTruckService().saveOrUpdate(truck2);
        ApplicationContext.getTruckService().saveOrUpdate(truck3);
        ApplicationContext.getTruckService().saveOrUpdate(truck4);


        ApplicationContext.getCarService().carSeatingAbove(4)
                .stream().map(Vehicle::getBrand)
                .forEach(System.out::println);

        System.out.println(ApplicationContext.getCarService().averageManfYear());
        System.out.println(ApplicationContext.getCarService().brandCount());
        ApplicationContext.carDetachmentDemo(1L, Fuel.DIESEL);

    }
}

