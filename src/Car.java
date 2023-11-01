public abstract class Car {
    private final String make;
    private final int year;
    private int mileage;
    private final String vin;
    private double price;

    public Car(String make, int year, int mileage, String vin, double price) {
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.vin = vin;
        this.price = price;
    }

    public String getVin() {
        return vin;
    }
    public int getMileage() {
        return mileage;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getYear() {
        return year;
    }
    public String getMake() {
        return make;
    }
    public String getListingText() {
        return "Price: " + this.getPrice()
                + "\nMake: " + this.getMake()
                + "\nModel: " + this.getYear()
                + "\nMileage: " + this.getMileage()
                + "\nVIN: " + this.getVin();
    }

    public abstract void makeHornNoise();
}
