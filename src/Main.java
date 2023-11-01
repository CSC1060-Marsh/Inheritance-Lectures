public class Main {
    public static void main(String[] args) {
        Car[] listings = getListings();
        for (Car car : listings) {
            System.out.println(car.getListingText());
            System.out.println();
        }
    }

    public static Car[] getListings() {
        Car car = new Car("Toyota Corolla", 2010, 23405, "IAMAVIN",250.0);
        Car car2 = new Car("Toyota Corolla",2011,108,"IAMASECONDVIN",115023.55);
        Truck truck = new Truck("Toyota Tacoma",2008,80000,"112",20000.22,5);
        return new Car[]{car, car2, truck};
    }
}