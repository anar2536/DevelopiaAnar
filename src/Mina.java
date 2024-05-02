public class Mina {
    public static void main(String[] args) {
        int limit = 50;
        boolean bool = true;
        for (int num = 2;num <= limit;num++) {
            for (int divider = 2;divider <= Math.sqrt(num);divider++) {
                if (num % divider == 0) {
                    bool = false;
                }
            }
            if (bool) {
                System.out.println(num);
            }
            bool = true;
        }
    }
}
