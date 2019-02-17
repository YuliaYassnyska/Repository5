package ua.lviv.iot.armament.model;

public class Grenade extends Armament {

	private String origin;
	private String name;
	
	public Grenade() {
	}

	public Grenade(ApartmentType type, double price, Power power, Use use, User user, int amount, String origin, String name) {
		super(type, price, power, use, user, amount);
		this.origin = origin;
		this.name = name;
	}
 
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
