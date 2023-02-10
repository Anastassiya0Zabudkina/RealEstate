package flat;

public class Office extends RealEstate {
    private int rooms;
    private String nameOfCentre;
    private int officeNumber;

    public Office() {
    }

    public Office(int price, int rooms, String nameOfCentre, int officeNumber) {
        this.price = price;
        this.rooms = rooms;
        this.nameOfCentre = nameOfCentre;
        this.officeNumber = officeNumber;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getNameOfCentre() {
        return nameOfCentre;
    }

    public void setNameOfCentre(String nameOfCentre) {
        this.nameOfCentre = nameOfCentre;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public String getShortAddress() {
        return super.getShortAddress() + "Centre name: " + this.nameOfCentre;
    }

    @Override
    public String getFullAddress() {
        return super.getFullAddress() + "Centre name: " + this.nameOfCentre + ". Номер офиса " + this.officeNumber + ".";
    }

    @Override
    public String getDescription() {
        return "Офис. " + "Цена " + this.price + ". Площадь " + this.square + " кв.м. " + this.rooms + " - комнатный. Centre name: " + this.nameOfCentre + ". Номер офиса " + this.officeNumber + ".";
    }

    @Override
    public String toString() {
        return "Office{" +
                "rooms=" + rooms +
                ", nameOfCentre='" + nameOfCentre + '\'' +
                ", officeNumber=" + officeNumber +
                ", price=" + price +
                ", square=" + square +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", crossing='" + crossing + '\'' +
                '}';
    }
}
