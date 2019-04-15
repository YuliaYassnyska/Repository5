package ua.lviv.iot.armament.model;

public class Grenade extends Armament {

	private String origin;
	private String name;

	public Grenade() {
	}

	public Grenade(final ApartmentType type, final double price, final Power power, final Use use, final User user,
			final int amount, final String origin, final String name) {
		super(type, price, power, use, user, amount);
		this.origin = origin;
		this.name = name;
	}

	public String getHeaders() {
		return super.getHeaders() + ", " + "origin" + ", " + "name";
	}

	public String toCSV() {
		return super.toCSV() + ", " + origin + ", " + name;
	}

	public final String getOrigin() {
		return origin;
	}

	public final void setOrigin(final String origin) {
		this.origin = origin;
	}

	public final String getName() {
		return name;
	}

	public final void setName(final String name) {
		this.name = name;
	}

}
