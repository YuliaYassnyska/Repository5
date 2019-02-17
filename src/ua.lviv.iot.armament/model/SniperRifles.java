package ua.lviv.iot.armament.model;

public class SniperRifles extends Armament {
	
	private int caliber;
	private String kind;

	public SniperRifles() {
	}

	public SniperRifles(ApartmentType type, double price, Power power, Use use, User user, int caliber, String kind, int amount) {
		super(type, price, power, use, user, amount);
		this.caliber = caliber;
		this.kind = kind;
	}

	public int getCaliber() {
		return caliber;
	}

	public void setCaliber(int caliber) {
		this.caliber = caliber;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

}
