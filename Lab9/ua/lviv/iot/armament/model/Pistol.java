package ua.lviv.iot.armament.model;

public class Pistol extends Armament {

    private int caliber;
    private String origin;

    public Pistol() {
    }

    public Pistol(final ApartmentType type,
            final double price,
            final Power power,
            final Use use,
            final User user,
            final int amount,
            final int caliber,
            final String origin) {
        super(type, price, power, use, user, amount);
        this.caliber = caliber;
        this.origin = origin;
        }
    
    public String getHeaders() {

        return super.getHeaders() + ", " + "caliber" + ", " + "origin";

      }



      public String toCSV() {

        return super.toCSV() + ", " + caliber + ", " + origin;

      }

    public final int getCaliber() {
         return caliber;
    }

    public final void setCaliber(final int caliber) {
        this.caliber = caliber;
    }

    public final String getOrigin() {
        return origin;
    }

    public final void setOrigin(final String origin) {
        this.origin = origin;
    }

}
