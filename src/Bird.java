public class Bird extends Animal {
    private int wingsLenght;

    public Bird(String name, int birthYear, int wingsLenght) {
        super(name, birthYear);
        this.wingsLenght = wingsLenght;
    }

    public int getWingsLenght() {
        return wingsLenght;
    }
    @Override
    public void makeSound() {
        System.out.println("cwir cwir");
    }
}
