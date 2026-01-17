public abstract class Vehicle   {
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
}




