public class Developer extends Employee implements BonusEligible {
    public Developer(String data, int salaryBase) {
        super(data, salaryBase);
    }
    @Override
    public int calculateBonus() {
        return getSalaryBase()* 30/ 100;
    }

}
