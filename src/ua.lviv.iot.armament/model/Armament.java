package ua.lviv.iot.armament.model;

public class Armament {
	
	private ApartmentType type;
	private double price;
	private Power power;
	private Use use;
	private User user;
	private int amount;
	
	public Armament() {
	}

	public Armament(ApartmentType type, double price, Power power, Use use, User user, int amount) {
		this.type = type;
		this.price = price;
		this.power = power;
		this.use = use;
		this.user = user;
		this.amount = amount;
	}
	
	@Override

	public String toString() {

		return "Armament [type=" + type + ", price=" + price +

				", power=" + power + ", use=" + use + ", user=" +

				user + ", amount=" + amount + "]";
	}

	public ApartmentType getType() {
		return type;
	}

	public void setType(ApartmentType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Power getPower() {
		return power;
	}

	public void setPower(Power power) {
		this.power = power;
	}

	public Use getUse() {
		return use;
	}

	public void setUse(Use use) {
		this.use = use;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
