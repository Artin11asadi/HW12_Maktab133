package repository.impl;


import repository.BaseRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;
import model.BaseEntity;
import util.EntityManagerProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BaseRepositoryImpl<ID, TYPE extends BaseEntity<ID>> implements BaseRepository<ID, TYPE> {

    private final Class<TYPE> entityClass;

    public BaseRepositoryImpl(Class<TYPE> entityClass) {
        this.entityClass = entityClass;
    }

    protected Class<TYPE> getEntityClass() {
        return entityClass;
    }

    @Override
    public TYPE saveOrUpdate(TYPE type) {
        EntityManager em = EntityManagerProvider.entityManager.get();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            if (type.getId() == null) {
                em.persist(type);
            } else {
                em.merge(type);
            }
            transaction.commit();
            return type;

        } catch (PersistenceException p) {
            transaction.rollback();
            throw new PersistenceException("saving failed " + p.getMessage());

        } finally {
            em.close();
        }
    }


    @Override
    public Boolean deleteById(ID id) {
        EntityManager em = EntityManagerProvider.entityManager.get();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            TYPE entity = em.find(getEntityClass(), id);
            if (entity == null) {
                return false;
            }
            em.remove(entity);
            transaction.commit();
            return true;


        } catch (PersistenceException p) {
            transaction.rollback();
            throw new PersistenceException("deleting failed " + p.getMessage());

        } finally {
            em.close();
        }
    }


    @Override
    public Optional<TYPE> findById(ID id) {
        EntityManager em = EntityManagerProvider.entityManager.get();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            TYPE entity = em.find(getEntityClass(), id);
            return Optional.ofNullable(entity);

        } catch (PersistenceException p) {
            transaction.rollback();
            throw new PersistenceException("finding by id failed " + p.getMessage());

        } finally {
            em.close();
        }
    }

    @Override
    public List<TYPE> findAll() {
        EntityManager em = EntityManagerProvider.entityManager.get();
        EntityTransaction transaction = em.getTransaction();
        int id = 1;
        List<TYPE> allEntities = new ArrayList<>();
        try {
            transaction.begin();
            while (true) {
                TYPE entity = em.find(getEntityClass(), id);
                if (entity == null) {
                    break;
                }
                allEntities.add(entity);
                id++;
            }
            return allEntities;

        } catch (PersistenceException p) {
            transaction.rollback();
            throw new PersistenceException("finding all entities failed " + p.getMessage());

        } finally {
            em.close();
        }
    }
}
