public class bankAccount {
    public static class Bank {
        String name;
        double amount;
        public Bank() {
            this.name = "someone";
            this.amount = 0;
        }
        public Bank (String name,double amount) {
            this.name = name;
            this.amount = amount;
        }
        public static void displayAccount(Bank account) {
            System.out.println(account.name);
            System.out.println(account.amount);
        }
        public static void set_acoount(Bank account,String name,double amount) {
            account.name = name;
            account.amount = amount;
        }
        public static void withDraw(Bank account,double amount) {
            if (amount > account.amount) {
                System.out.println("we can not do this");
                return;
            }
            account.amount -= amount;
        }
        public static void deposit(Bank account,double amount) {
            if (amount <= 0) {
                System.out.println("we can do this");
            }
            account.amount += amount;
        }
    }
    public static void main(String[] args) {
        Bank person1 = new Bank();
        Bank.deposit(person1,10000);
        System.out.println(person1.amount);
    }
}
