public abstract class Vehicle {
    private String brand;
    private int yearOfProduction;
    public Vehicle(String brand, int yearOfProduction) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
    }

    protected Vehicle() {
    }

    public String getBrand() {
        return brand;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public String toString()    {
        return brand + ", rok produkcji " + yearOfProduction;
    }
    public void refuel()   {
        System.out.println("Vehicule is refueling!");
    }
    public void charge ()  {
        System.out.println("Vehicule is charging!");
    }
}




