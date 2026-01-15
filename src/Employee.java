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
    public String toString()    {
        return "This is " + data + ", his/her salary base is " + salaryBase;
    }

}
