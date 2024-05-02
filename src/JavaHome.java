public class JavaHome {
    public static void main(String[] args) {
        // 1.
        int num1 = 55;
        byte byteNum1 = (byte) num1;

        // 2.
        short num2 = 636;
        byte byteNum2 = (byte) num2;

        // 3.
        long num3 = 458;
        short shortNum3 = (short) num3;

        // 4.
        long num4 = 92523635483L;
        int intNum4 = (int) num4;

        // 5.
        double num5 = 65787.3;
        int intNum5 = (int) num5;

        // 6.
        char ch = 'q';
        int intCh = (int) ch;

        // 7.
        int num7 = 266;
        char charNum7 = (char) num7;

        // Print results
        System.out.println("1. int to byte: " + byteNum1);
        System.out.println("2. short to byte: " + byteNum2);
        System.out.println("3. long to short: " + shortNum3);
        System.out.println("4. long to int: " + intNum4);
        System.out.println("5. double to int: " + intNum5);
        System.out.println("6. char to int: " + intCh);
        System.out.println("7. int to char: " + charNum7);
    }
}
