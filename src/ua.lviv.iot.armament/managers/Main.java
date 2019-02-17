package ua.lviv.iot.armament.managers;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.armament.model.ApartmentType;
import ua.lviv.iot.armament.model.Armament;
import ua.lviv.iot.armament.model.Power;
import ua.lviv.iot.armament.model.Use;
import ua.lviv.iot.armament.model.User;

public class Main {

public static void main(String[] args) {
		
		List<Armament> armament = new ArrayList<Armament>(); 

		

		armament.add(new Armament(ApartmentType.PISTOLS, 1500, Power.LOW, Use.ATTACK, User.CIVIL, 3));

		armament.add(new Armament(ApartmentType.GRENADES, 3000, Power.HIGH, Use.DEFENSE, User.CIVIL, 5));

		armament.add(new Armament(ApartmentType.SNIPERDEVISE, 2500, Power.MIDDLE, Use.DEFENSE, User.COLDIER, 6));

		armament.add(new Armament(ApartmentType.PISTOLS, 2000, Power.LOW, Use.ATTACK, User.CIVIL, 9));

		armament.add(new Armament(ApartmentType.SNIPERDEVISE, 4000, Power.HIGH, Use.DEFENSE, User.COLDIER, 1));
		
		
		List<Armament> sortedArmament =

				(new MilitaryManager(armament)).sortByPrice(false);

		System.out.println(sortedArmament);

		

		List<Armament> sortedArmament1 =

				(new MilitaryManager(armament)).sortByAmount(true);

		System.out.println(sortedArmament1);
	}
}
