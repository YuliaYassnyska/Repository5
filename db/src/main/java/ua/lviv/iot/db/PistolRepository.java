package ua.lviv.iot.db;

import org.springframework.data.repository.CrudRepository;

import ua.lviv.iot.armament.model.Pistol;

public interface PistolRepository extends CrudRepository<Pistol, Integer> {

}
