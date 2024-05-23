public class mainJava {
    public static void main(String[] args) {
        // 1.
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        String strFromArray = new String(charArray);
        System.out.println("String from char array: " + strFromArray);
        // 3.
        String emptyString = "";
        boolean isEmpty = emptyString.isEmpty();
        System.out.println("Is the string empty? " + isEmpty);
        //4.
        boolean result = endsWith("Hello, World!", "World!");
        System.out.println("Does 'Hello, World!' end with 'World!'? " + result);
        // 6.
        double fractionalNumber = 12.34567;
        double roundedNumber = Math.round(fractionalNumber * 100.0) / 100.0;
        System.out.println("Rounded number to two decimal places: " + roundedNumber);

    }
    public static boolean endsWith(String str, String suffix) {
        return str.endsWith(suffix);
    }
}
