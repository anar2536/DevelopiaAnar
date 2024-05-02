public class TreeHome {
    public static void main(String[] args) {
        double start_litr = 1;
        int growth = 15;
        double start_height = 30;
        int day = 0;
        while (start_height <= 1000) {
            start_height += (int) start_litr * growth;
            start_litr *= 1.5;
            day++;
        }
        System.out.println(day);
    }
}
