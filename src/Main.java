
public class Main {
    public static void main(String[] args) {
        // 1.
        String name = "Məhərrəm";
        System.out.println("Name: " + name);

        // 2.
        String message = "Java dilini öyrənmək maraqlı və faydalıdır";
        System.out.println("Message: " + message);

        // 3.
        System.out.println("Message length: " + message.length());

        // 4.
        System.out.println("7th character of message: " + message.charAt(6));

        // 5.
        System.out.println("Index of 'n' in message: " + message.indexOf('n'));

        // 6.
        System.out.println("Message in lowercase: " + message.toLowerCase());

        // 7.
        System.out.println("Message in uppercase: " + message.toUpperCase());

        // 8.
        System.out.println("Does the message contain 'Java'? " + message.contains("Java"));

        // 9.
        System.out.println("Does the message end with 'faydalıdır'? " + message.endsWith("faydalıdır"));

        // 10.
        System.out.println("Does the message start with 'Java'? " + message.startsWith("Java"));

        // 11.
        name = "   Ayxan ";
        // 12.
        System.out.println("Trimmed name: '" + name.trim() + "'");

        // 13.
        name = "Kamil";
        // 14.
        System.out.println("First 4 characters of name: " + name.substring(0, 4));

        // 15.
        name = "Hüseyn Mehdizadə";
        // 16.
        String[] parts = name.split(" ");
        // 17.
        System.out.println("Parts of the name:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}