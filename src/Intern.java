public class Intern extends Employee implements Reportable {
    public Intern(String data, int salaryBase) {
        super(data, salaryBase);
    }
    @Override
    public String toString() {
        return "This is " + getData() + ", he/ she gains nothing";
    }
    @Override
    public void report() {
        System.out.println("Do you need more coffee sir?");
    }
}
