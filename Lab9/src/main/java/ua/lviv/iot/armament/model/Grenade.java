package ua.lviv.iot.armament.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("childClass")
public class Grenade extends Armament {

	@Column
	private String origin;
	@Column
	private String name;

	public Grenade() {
	}

	public Grenade(final ApartmentType type, final double price, final Power power, final Use use, final User user,
			final int amount, final String origin, final String name) {
		super(type, price, power, use, user, amount);
		this.origin = origin;
		this.name = name;
	}


	public String getOrigin() {
		return origin;
	}

	public void setOrigin(final String origin) {
		this.origin = origin;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
