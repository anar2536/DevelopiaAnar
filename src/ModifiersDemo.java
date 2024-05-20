public class ModifiersDemo {
    public static class Person {
        public String name;
        protected int age;
        private double account_amount;
        static int count = 0;
        public Person() {
            this.name = "soemone";
            this.age = 0;
            this.account_amount = 0;
            Person.count++;
        }
        public Person (String name) {
            this.name = name;
            Person.count++;
        }
        private Person (double amount) {
            this.account_amount = amount;
            Person.count++;
        }
        protected Person(int age) {
            this.age = age;
            Person.count++;
        }
        public void setName (final String name) {
            this.name = name;
        }
        protected void setAge(final int age) {
            this.age = age;
        }
        private void setAccount_amount(final double amount) {
            this.account_amount = amount;
        }
        public void displayInformation() {
            System.out.println(count + " person:" + this.name);
            System.out.println(this.account_amount);
            System.out.println(this.age);
        }
    }
}
