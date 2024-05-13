public class ClassAndObjectAndConstructorsHome {
    public static class Employee {
        int id;
        String name;
        String surname;
        String phone;
        String address;
        int salary;
        public  Employee() {
            System.out.println("this is default constructor");
        }
        public Employee(String name) {
            this.name = name;
        }
        public Employee(String name,String surname) {
            this.name = name;
            this.surname = surname;
        }
        public  Employee(String name,String phone,int salary) {
            this.name = name;
            this.phone = phone;
            this.salary = salary;
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("tom");
        Employee emp2 = new Employee("tom","harvey");
        Employee emp3 = new Employee("tom","123123",123);
        System.out.println(emp1.name);
        System.out.println(emp2.name);
        System.out.println(emp2.surname);
        System.out.println(emp3.name);
        System.out.println(emp3.phone);
        System.out.println(emp3.salary);
        System.out.println(emp1.name);
    }
}
