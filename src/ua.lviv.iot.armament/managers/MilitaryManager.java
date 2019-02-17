package ua.lviv.iot.armament.managers;

import ua.lviv.iot.armament.model.*;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Collections;

public class MilitaryManager {

	private List<Armament> armament;
	
	public MilitaryManager() {
	}
	
	public MilitaryManager(List<Armament> armament) {
		this.armament = armament;
	}

	public List<Armament> sortByPrice(boolean descending) {
		Comparator<Armament> comparator = 

				(Armament obj1, Armament obj2) -> 

				Double.compare((obj1.getPrice()),(obj2.getPrice()));

			List<Armament> armamentList = armament;

			armamentList.sort(comparator);

			if (descending) {

				Collections.reverse(armamentList);

			}

			return armamentList;
	}
	
	public List<Armament> sortByAmount(boolean descending) {

		Comparator<Armament> comparator = 

			(Armament obj1, Armament obj2) ->

			Integer.compare((obj1.getAmount()),(obj2.getAmount()));

		List<Armament> armamentList = armament;

		armamentList.sort(comparator);

		if (descending) {

			Collections.reverse(armamentList);

		}

		return armamentList;

	}
	
	public List<Armament> findType(ApartmentType type) {

		List<Armament> armamentList = armament;

		List<Armament> findArmamentList = armamentList.stream()

				.filter(armament -> armament.getType() == type)

				.collect(Collectors.toList());

		return findArmamentList;

	}



	public List<Armament> findPower(Power power) {

		List<Armament> armamentList = armament;

		List<Armament> findArmamentList = armamentList.stream()

				.filter(armament -> armament.getPower() == power)

				.collect(Collectors.toList());

		return findArmamentList;

	}



	public List<Armament> findUser(User user) {

		List<Armament> armamentList = armament;

		List<Armament> findArmamentList = armamentList.stream()

				.filter(armament -> armament.getUser() == user)

				.collect(Collectors.toList());

		return findArmamentList;

	}
	
	public List<Armament> getArmament() {
		return armament;
	}

	public void setArmament(List<Armament> armament) {
		this.armament = armament;
	}
}
