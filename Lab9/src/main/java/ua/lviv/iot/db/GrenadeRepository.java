package ua.lviv.iot.db;

import org.springframework.data.repository.CrudRepository;

import ua.lviv.iot.armament.model.Grenade;

public interface GrenadeRepository extends CrudRepository<Grenade, Integer> {

}
