public class Sedan extends Car implements Automobile {
    private int numberOfWheels;
    public Sedan(String make, int year, int mileage, String vin, double price, int numberOfWheels) {
        super(make, year, mileage, vin, price);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void makeHornNoise() {
        System.out.println("nnnnnnnnnnnnnnnn");
    }

    @Override
    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }
}
