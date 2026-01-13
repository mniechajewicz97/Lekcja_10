public class Duck implements  Flyable, Swimmable{
    @Override
    public void fly() {
        System.out.println("Duck is flying like a duck!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming like a duck!");
    }
}
