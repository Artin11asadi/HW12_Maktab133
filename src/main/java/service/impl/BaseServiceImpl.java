package service.impl;

import model.BaseEntity;
import repository.BaseRepository;
import service.BaseService;

import java.util.List;
import java.util.Optional;

public class BaseServiceImpl<ID, TYPE extends BaseEntity<ID>, R extends BaseRepository<ID, TYPE>> implements BaseService<ID, TYPE> {

    protected final R repository;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public TYPE saveOrUpdate(TYPE type) {
        if (type != null) {
            return repository.saveOrUpdate(type);
        }
        return null;
    }

    @Override
    public boolean deleteById(ID id) {
        if (id != null){
            return repository.deleteById(id);

        }
        return false;
    }

    @Override
    public Optional<TYPE> findById(ID id) {
        if (id != null){
            return repository.findById(id);
        }
        return Optional.empty();
    }

    @Override
    public List<TYPE> findAll() {
        return repository.findAll();
    }
}