package service;

import model.BaseEntity;

import java.util.Map;
import java.util.OptionalDouble;

public interface VehicleService<ID, TYPE extends BaseEntity<ID>> extends BaseService<ID, TYPE>{

    OptionalDouble averageManfYear();

    Map<String, Long> brandCount();
}
