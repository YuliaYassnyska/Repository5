package ua.lviv.iot.armament.model;

public class SpecialAutomotiveEquipment extends Armament {

	private String modified;
	private String name;
	
	public SpecialAutomotiveEquipment() {
	}

	public SpecialAutomotiveEquipment(ApartmentType type, double price, Power power, Use use, User user, String modified, String name, int amount) {
		super(type, price, power, use, user, amount);
		this.modified = modified;
		this.name = name;
		
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
