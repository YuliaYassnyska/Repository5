package ua.lviv.iot.armament.model;

public class SpecialAutomotiveEquipment extends Armament {

    private String modified;
    private String name;

    public SpecialAutomotiveEquipment() {
    }

    public SpecialAutomotiveEquipment(final ApartmentType type,
            final double price,
            final Power power,
            final Use use,
            final User user,
            final int amount,
            final String modified,
            final String name) {
        super(type, price, power, use, user, amount);
        this.modified = modified;
        this.name = name;
    }
    
    public String getHeaders() {

        return super.getHeaders() + ", " + "modified" + ", " + "name";

      }



      public String toCSV() {

        return super.toCSV() + ", " + modified + ", " + name;

      }

    public String getModified() {
        return modified;
    }

    public void setModified(final String modified) {
        this.modified = modified;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
