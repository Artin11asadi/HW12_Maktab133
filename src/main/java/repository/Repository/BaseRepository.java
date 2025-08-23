package repository.Repository;

import model.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<ID, TYPE extends BaseEntity<ID>> {

    public TYPE saveOrUpdate(TYPE type);

    boolean deleteById(ID id);

    Optional<TYPE> findById(ID id);

    List<TYPE> findAll(ID id);


}
