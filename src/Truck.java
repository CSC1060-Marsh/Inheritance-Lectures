public class Truck extends Car {
    private final int groundClearanceInInches;

    public Truck(String make, int year, int mileage, String vin, double price, int groundClearanceInInches) {
        super(make, year, mileage, vin, price);
        this.groundClearanceInInches = groundClearanceInInches;
    }

    @Override
    public String getListingText() {
        return "Hey I'm a truck!";
    }
}
