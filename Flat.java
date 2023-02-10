package flat;

public class Flat extends RealEstate {

    private int rooms;
    private int livesquare;
    private int kitchensquare;
    private int floor;
    private int totalFloors;
    private int apartment;

    public Flat() {
    }

    public Flat(int price, int rooms, int livesquare, int kitchensquare, int floor, int totalFloors, int apartment) {
        this.price = price;
        this.rooms = rooms;
        this.livesquare = livesquare;
        this.kitchensquare = kitchensquare;
        this.floor = floor;
        this.totalFloors = totalFloors;
        this.apartment = apartment;
    }

    public int getRooms() {
        return rooms;
    }

    public int getLivesquare() {
        return livesquare;
    }

    public int getKitchensquare() {
        return kitchensquare;
    }

    public int getFloor() {
        return floor;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public int getApartment() {
        return apartment;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setLivesquare(int livesquare) {
        this.livesquare = livesquare;
    }

    public void setKitchensquare(int kitchensquare) {
        this.kitchensquare = kitchensquare;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    @Override
    public String getShortAddress() {
        return super.getShortAddress() + "Apartment number: " + this.apartment;
    }

    @Override
    public String getFullAddress() {
        return super.getFullAddress() + "Floor" + this.floor + "/" + totalFloors + ". Apartment number: " + this.apartment;
    }

    @Override
    public String getDescription() {
        return "Квартира. " + "Цена " + this.price + ". Площадь " + this.square + " кв.м. " + "Кол-во комнат " + this.rooms + ". Жилая " + this.livesquare +
                "кв.м. Кухня " + this.kitchensquare + ". Этаж " + this.floor + "/" + this.totalFloors + ".";
    }

    @Override
    public String toString() {
        return "Flat{" +
                "rooms=" + rooms +
                ", livesquare=" + livesquare +
                ", kitchensquare=" + kitchensquare +
                ", floor=" + floor +
                ", totalFloors=" + totalFloors +
                ", apartment=" + apartment +
                ", price=" + price +
                ", square=" + square +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", crossing='" + crossing + '\'' +
                '}';
    }
}
