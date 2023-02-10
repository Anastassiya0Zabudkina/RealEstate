package flat;

public abstract class RealEstate implements Comparable<RealEstate> {
    protected int price;
    protected int square;
    protected String city;
    protected String street;
    protected int house; // исправить на String
    protected String crossing;

    public RealEstate() {
    }


    public int getPrice() {
        return this.price;
    }

    public int getSquare() {
        return this.square;
    }

    public String getCity() {
        return this.city;
    }

    public String getStreet() {
        return this.street;
    }

    public int getHouse() {
        return this.house;
    }

    public String getCrossing() {
        return this.crossing;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setCrossing(String crossing) {
        this.crossing = crossing;
    }

    public final double getPricePerSquareMeter() {
        double PricePerSquareMeter = (double) price / (double) square;
        return PricePerSquareMeter;
    }

    public String getShortAddress() {
        return this.street + ", " + this.house + ". ";
    }

    public String getFullAddress() {
        return this.city + ", " + this.street + ", " + this.house + ", " + this.crossing + ". ";
    }

    public abstract String getDescription();

    @Override
    public String toString() {
        return "RealEstate{" +
                "price=" + price +
                ", square=" + square +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", crossing='" + crossing + '\'' +
                '}';
    }

    @Override
    public int compareTo(RealEstate o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        } else {
            return 0;
        }
    }
}
