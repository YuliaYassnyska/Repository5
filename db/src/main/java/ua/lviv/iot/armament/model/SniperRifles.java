package ua.lviv.iot.armament.model;

public class SniperRifles extends Armament {

    private int caliber;
    private String kind;

    public SniperRifles() {
    }

    public SniperRifles(final ApartmentType type,
            final double price,
            final Power power,
            final Use use,
            final User user,
            final int amount,
            final int caliber,
            final String kind) {
        super(type, price, power, use, user, amount);
        this.caliber = caliber;
        this.kind = kind;
    }
    
    public int getCaliber() {
        return caliber;
    }

    public void setCaliber(final int caliber) {
        this.caliber = caliber;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

}
