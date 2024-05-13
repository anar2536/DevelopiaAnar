public class MethodsHome {
    public static void printNumbers(int begin,int end) {
        for (int num = begin;num < end;num++) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        printNumbers(12,23);
        System.out.println("--------");
        printNumbers(34,45);
        System.out.println("--------");
        printNumbers(55,60);
    }
}
