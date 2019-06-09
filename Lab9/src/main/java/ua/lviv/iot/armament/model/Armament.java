package ua.lviv.iot.armament.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "childType", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "ParentClass")
public class Armament {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column
    private ApartmentType type;

    @Column
    private double price;

    @Enumerated(EnumType.STRING)
    @Column
    private Power power;

    @Enumerated(EnumType.STRING)
    @Column(name = "use1")
    private Use use;

    @Enumerated(EnumType.STRING)
    @Column
    private User user;
    @Column
    private int amount;

    public Armament() {
        super();
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
        return "Armament [ type= " + type + ", price=" + price + ", power=" + power + ", use=" + use + ", user=" + user
                + ", amount=" + amount + "]";
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
