public class Main {
    public static void main(String[] args) {
        // 1.
        for (int num = 15; num <= 40; num++) {
            System.out.println(num);
        }
        // 2.
        System.out.println("---------------------");
        for (int num = 20; num <= 50; num++) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}
