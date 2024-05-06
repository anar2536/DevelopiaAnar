public class ClassAndObjectHome {
    public static class Person {
        int id;
        String name;
        String surname;
        int age;
        String phone;
    }
    public static void main(String[] args) {
        Person pr1 = new Person();
        pr1.age = 12;
        pr1.id = 111;
        System.out.println(pr1.age);
        System.out.println(pr1.id);
    }
}
