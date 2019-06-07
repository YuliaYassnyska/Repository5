package ua.lviv.iot.db;

import org.springframework.data.repository.CrudRepository;

import ua.lviv.iot.armament.model.Armament;

public interface ArmamentRepository extends CrudRepository<Armament, Integer>{

}
