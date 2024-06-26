package newPackage;

public class Operator implements Employee {
    private int salary;

    public Operator(int salary) {
        this.salary = salary;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }

    @Override
    public void onFire() {
        System.out.println("Operator işdən çıxarıldı.");
    }

    @Override
    public void onHire() {
        System.out.println("Operator işə qəbul edildi.");
    }
}