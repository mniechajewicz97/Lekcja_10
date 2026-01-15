public class Hybrid extends Vehicle implements Chargeable, Refuelable {
    public Hybrid(String brand, int yearOfProduction) {
        super(brand, yearOfProduction);
    }
    @Override
    public void charge () {
        System.out.println("Hybrid is charging");
    }
    @Override
    public void refuel () {
        System.out.println("Hybrid is refueling");
    }
}
