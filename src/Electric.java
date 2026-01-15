public class Electric extends Vehicle implements Chargeable {
    public Electric(String brand, int yearOfProduction) {
        super(brand, yearOfProduction);
    }

    @Override
    public void charge() {
        System.out.println("I'll be ready in two hours!");
    }

}
