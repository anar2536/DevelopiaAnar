package newPackage;

public class TopManager implements Employee {
    private int salary;

    public TopManager(int salary) {
        this.salary = salary;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }

    @Override
    public void onFire() {
        System.out.println("Top Manager işdən çıxarıldı.");
    }

    @Override
    public void onHire() {
        System.out.println("Top Manager işə qəbul edildi.");
    }
}
