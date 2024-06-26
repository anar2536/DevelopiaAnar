package newPackage;

public class Manager implements Employee {
    private int salary;

    public Manager(int salary) {
        this.salary = salary;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }

    @Override
    public void onFire() {
        System.out.println("Manager işdən çıxarıldı.");
    }

    @Override
    public void onHire() {
        System.out.println("Manager işə qəbul edildi.");
    }
}