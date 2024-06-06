class Person {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String phone;
    private String address;
    public Person(int id, String name, String surname, int age, String phone, String address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }
}

class Employee extends Person {
    private double salary;
    private String department;
    private String username;
    private String password;
    public Employee(int id, String name, String surname, int age, String phone, String address,
                    double salary, String department, String username, String password) {
        super(id, name, surname, age, phone, address);
        this.salary = salary;
        this.department = department;
        this.username = username;
        this.password = password;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}

public class Something {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John", "Doe", 30, "123456789", "123 Main St",
                50000.0, "IT", "johndoe", "password123");
        employee.printInfo();
    }
}
