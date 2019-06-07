package ua.lviv.iot.db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import ua.lviv.iot.armament.model.ApartmentType;
import ua.lviv.iot.armament.model.Armament;
import ua.lviv.iot.armament.model.Grenade;
import ua.lviv.iot.armament.model.Power;
import ua.lviv.iot.armament.model.Use;
import ua.lviv.iot.armament.model.User;


@SpringBootApplication
@EntityScan(basePackages = {"ua.lviv.iot.armament.model"})
public class DbApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DbApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(GrenadeRepository repository) {      
		return (args) -> {     
			repository.save(new Grenade(ApartmentType.PISTOLS, 3000.0, Power.HIGH, Use.ATTACK, User.CIVIL, 3, "Germany", "yuka"));
//			repository1.save(new Armament(ApartmentType.PISTOLS, 3000.0, Power.HIGH, Use.ATTACK, User.CIVIL, 3));
			
			repository.findAll().forEach(System.out::println);
//			repository1.findAll().forEach(System.out::println);
		};  
	}

}
