import java.util.Date;
import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Test {
    public static void main(String[] args) {
        // Task 1: Create a java.util.Date object representing the current date and time
        Date currentDate = new Date();
        System.out.println("1. Current Date and Time (java.util.Date): " + currentDate);

        // Task 2: Convert a java.util.Date object to java.sql.Date
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println("2. Converted to java.sql.Date: " + sqlDate);

        // Task 3: Extract the year, month, and day from a LocalDate object
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        System.out.println("3. Year: " + year + ", Month: " + month + ", Day: " + day);

        // Task 4: Create a LocalTime object representing the current time
        LocalTime localTime = LocalTime.now();
        System.out.println("4. Current Time (LocalTime): " + localTime);

        // Task 5: Convert a LocalTime object to a string in the format "HH:mm:ss"
        String timeString = localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("5. Current Time as String: " + timeString);

        // Task 6: Create a LocalDateTime object representing the current date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("6. Current Date and Time (LocalDateTime): " + localDateTime);

        // Task 7: Convert a string in the format "yyyy-MM-dd" to a LocalDate object
        String dateString = "2024-06-13";
        LocalDate parsedDate = LocalDate.parse(dateString, DateTimeFormatter.ISO_DATE);
        System.out.println("7. Parsed LocalDate: " + parsedDate);

        // Task 8: Convert a string in the format "HH:mm:ss" to a LocalTime object
        String timeString2 = "12:30:45";
        LocalTime parsedTime = LocalTime.parse(timeString2, DateTimeFormatter.ISO_TIME);
        System.out.println("8. Parsed LocalTime: " + parsedTime);

        // Task 9: Add 5 days to the current date using LocalDate
        LocalDate futureDate = LocalDate.now().plusDays(5);
        System.out.println("9. Date 5 days from now: " + futureDate);

        // Task 10: Subtract 3 hours from the current time using LocalTime
        LocalTime earlierTime = LocalTime.now().minusHours(3);
        System.out.println("10. Time 3 hours ago: " + earlierTime);
    }
}
