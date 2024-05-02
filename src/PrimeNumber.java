public class PrimeNumber {
    public static void main(String[] args) {
        int limit = 34;
        int count = 0;
        int num = 2;
        while (true) {
            boolean bool = true;
            for (int divider = 2;divider <= Math.sqrt(num);divider++) {
                if (num % divider == 0) {
                    bool = false;
                }
            }
            if (bool) {
                System.out.println(num);
                count++;
            }
            num++;
            if (count == limit) {
                break;
            }
        }
    }
}
