import newPackage.Employee;
import newPackage.Operator;
import newPackage.Manager;
import newPackage.TopManager;

import java.util.*;

public class Company {
    private List<Employee> employees = new ArrayList<>();

    public void hire(Employee employee) {
        employees.add(employee);
        employee.onHire();
    }

    public void hireAll(List<Employee> employees) {
        for (Employee employee : employees) {
            hire(employee);
        }
    }

    public void fire(int count) {
        if (count > employees.size()) {
            count = employees.size();
        }
        for (int i = 0; i < count; i++) {
            Employee employee = employees.remove(employees.size() - 1);
            employee.onFire();
        }
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return employees.stream()
                .sorted(Comparator.comparingInt(Employee::getMonthSalary).reversed())
                .limit(count)
                .toList();
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return employees.stream()
                .sorted(Comparator.comparingInt(Employee::getMonthSalary))
                .limit(count)
                .toList();
    }

    public static void main(String[] args) {
        Company company = new Company();

        // 200 Operator, 50 Manager, 10 TopManager əlavə etmək
        for (int i = 0; i < 200; i++) {
            company.hire(new Operator((int) (Math.random() * 1000 + 1000)));
        }
        for (int i = 0; i < 50; i++) {
            company.hire(new Manager((int) (Math.random() * 2000 + 2000)));
        }
        for (int i = 0; i < 10; i++) {
            company.hire(new TopManager((int) (Math.random() * 3000 + 3000)));
        }

        // 50% ştatı ixtisar etmək
        int totalEmployees = company.employees.size();
        company.fire(totalEmployees / 2);

        // Ən çox və ən az maaş alanları çapa vermək
        System.out.println("Ən çox maaş alanlar:");
        for (Employee e : company.getTopSalaryStaff(10)) {
            System.out.println(e.getMonthSalary());
        }

        System.out.println("Ən az maaş alanlar:");
        for (Employee e : company.getLowestSalaryStaff(10)) {
            System.out.println(e.getMonthSalary());
        }
    }
}
