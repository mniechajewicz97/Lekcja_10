import java.util.Objects;

public abstract class Employee  {
    private String data;
    private int salaryBase;
    public Employee(String data, int salaryBase) {
        this.data = data;
        this.salaryBase = salaryBase;
    }
    public String getData() {
        return data;
    }
    public int getSalaryBase() {
        return salaryBase;
    }

    @Override
    public String toString()    {
        return "This is " + data + ", his/her salary base is " + salaryBase;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salaryBase == employee.salaryBase && Objects.equals(data, employee.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, salaryBase);
    }
}
