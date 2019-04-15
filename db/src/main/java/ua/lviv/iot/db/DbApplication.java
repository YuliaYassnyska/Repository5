package ua.lviv.iot.db;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ua.lviv.iot.armament.model.Pistol;
import ua.lviv.iot.armament.model.ApartmentType;
import ua.lviv.iot.armament.model.Armament;
import ua.lviv.iot.armament.model.Power;
import ua.lviv.iot.armament.model.Use;
import ua.lviv.iot.armament.model.User;


@SpringBootApplication
public class DbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbApplication.class);
	}

	@Bean
	public CommandLineRunner demo(PistolRepository repository) {      
		return (args) -> {     
			repository.save(new Armament(ApartmentType.PISTOLS, 3000.0, Power.HIGH, Use.ATTACK, User.CIVIL, 3));     
			repository.findAll().forEach(pistol -> System.out.println(pistol));   
			
			repository.findAll().forEach(System.out::println);
		};  
	}

}
