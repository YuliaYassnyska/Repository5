package ua.lviv.iot.db;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ua.lviv.iot.armament.model.Pistol;
import ua.lviv.iot.armament.model.ApartmentType;
import ua.lviv.iot.armament.model.Power;
import ua.lviv.iot.armament.model.Use;
import ua.lviv.iot.armament.model.User;


@SpringBootApplication
public class DbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DbApplication.class, args);
	}

	@Bean(name="commandLineRunner")
	public CommandLineRunner demo(PistolRepository repository) {      
		return (args) -> {     
			repository.save(new Pistol(ApartmentType.PISTOLS, 3000.0, Power.HIGH, Use.ATTACK, User.CIVIL, 3, 5, "Yulia's"));     
			repository.save(new Pistol(ApartmentType.SNIPERDEVISE, 2000.5, Power.MIDDLE, Use.DEFENSE, User.CIVIL, 2, 9, "Mossina-Nagana"));         
			repository.save(new Pistol(ApartmentType.SNIPERDEVISE, 4500.0, Power.HIGH, Use.ATTACK, User.COLDIER, 1, 3, ".338 Spectre"));        
			repository.findAll().forEach(pistol -> System.out.println(pistol));   
			
			repository.findAll().forEach(System.out::println);
		};  
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Running");
	} 
}
