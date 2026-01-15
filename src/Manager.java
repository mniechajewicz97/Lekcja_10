public class Manager extends Employee implements BonusEligible, Reportable {
    public Manager(String data, int salaryBase) {
        super(data, salaryBase);
    }
   @Override
    public int calculateBonus() {
        return getSalaryBase()* 20/ 100;
   }
   @Override
    public void report() {
        System.out.println("This is very confidential report");
   }
}
