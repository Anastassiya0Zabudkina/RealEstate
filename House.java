package flat;

public class House extends RealEstate {
    private int liveSquare;
    private int kitchenSquare;
    private int gardenSquare;
    private int floors;

    public House() {
    }

    public House(int price, int liveSquare, int kitchenSquare, int gardenSquare, int floors) {
        this.price = price;
        this.liveSquare = liveSquare;
        this.kitchenSquare = kitchenSquare;
        this.gardenSquare = gardenSquare;
        this.floors = floors;
    }

    public int getLiveSquare() {
        return liveSquare;
    }

    public void setLiveSquare(int liveSquare) {
        this.liveSquare = liveSquare;
    }

    public int getKitchenSquare() {
        return kitchenSquare;
    }

    public void setKitchenSquare(int kitchenSquare) {
        this.kitchenSquare = kitchenSquare;
    }

    public int getGardenSquare() {
        return gardenSquare;
    }

    public void setGardenSquare(int gardenSquare) {
        this.gardenSquare = gardenSquare;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }


    @Override
    public String getDescription() {
        return "Дом. " + "Цена " + this.price + ". Площадь " + this.square + " кв.м." + "Жилая " + this.liveSquare +
                "кв.м. Кухня " + this.kitchenSquare + ". Участок " + this.gardenSquare + " соток. Этажей " + this.floors + ".";
    }


    @Override
    public String toString() {
        return "House{" +
                "liveSquare=" + liveSquare +
                ", kitchenSquare=" + kitchenSquare +
                ", gardenSquare=" + gardenSquare +
                ", floors=" + floors +
                ", price=" + price +
                ", square=" + square +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", crossing='" + crossing + '\'' +
                '}';
    }
}