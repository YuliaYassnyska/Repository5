package ua.lviv.iot.armament.model;
 
public class Pistol extends Armament {
	
	private int caliber;
	private String origin;

	public Pistol() {
	}

	public Pistol(ApartmentType type, double price, Power power, Use use, User user, int amount, int caliber, String origin) {
		super(type, price, power, use, user, amount);
		this.caliber = caliber;
		this.origin = origin;
	}

	public int getCaliber() {
		return caliber;
	}

	public void setCaliber(int caliber) {
		this.caliber = caliber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
