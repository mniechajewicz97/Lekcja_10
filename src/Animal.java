public abstract class Animal {
    private String name;
    private int birthYear;

    public Animal(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    void makeSound() {
    }

    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }
}
