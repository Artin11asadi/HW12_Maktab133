package repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;
import model.Car;
import model.Fuel;
import repository.CarRepository;
import util.EntityManagerProvider;

public class CarRepositoryImpl extends BaseRepositoryImpl<Long, Car> implements CarRepository {

    @Override
    public Class<Car> getEntityClass() {
        return Car.class;
    }

    @Override
    public void carDetachmentDemo(Long id, Fuel newFuel) {
        EntityManager em = EntityManagerProvider.entityManager.get();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            Car car = em.find(getEntityClass(), id);
            System.out.println("our fuel type is " + car.getFuelType());

            em.detach(car);
            car.setFuelType(newFuel);
            Car managedCar = em.merge(car);
            transaction.commit();

            Car verifiedCar = em.find(Car.class, 1L);
            System.out.println("Updated fuel type: " + verifiedCar.getFuelType());


        } catch (PersistenceException p) {
            throw new PersistenceException("car detachment failed " + p.getMessage());
        } finally {
            em.close();
        }
    }
}

