public abstract class Vehicle implements Chargeable, Refuelable {
    private String brand;
    private int yearOfProduction;
    public Vehicle(String brand, int yearOfProduction) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public String toString()    {
        return brand + ", year of production " + yearOfProduction;
    }
    public void refuel()   {
        System.out.println("Vehicule is refueling!");
    }
    public void charge ()  {
        System.out.println("Vehicule is charging!");
    }
}




