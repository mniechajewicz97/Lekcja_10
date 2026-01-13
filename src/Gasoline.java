public class Gasoline extends Vehicle {
    public Gasoline(String brand, int yearOfProduction) {
        super(brand, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Oldschool Car is refueling");
    }

}
