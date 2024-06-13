import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
import java.util.Date;
public class Test1 {
    public static void main(String[] args) {
        // 11. Compare two LocalDate objects
        LocalDate date1 = LocalDate.of(2023, 6, 1);
        LocalDate date2 = LocalDate.of(2023, 6, 15);

        if (date1.compareTo(date2) < 0) {
            System.out.println("date1 is before date2");
        } else if (date1.compareTo(date2) > 0) {
            System.out.println("date1 is after date2");
        } else {
            System.out.println("date1 and date2 are equal");
        }

        // 12. Convert LocalDateTime to java.util.Date
        LocalDateTime localDateTime = LocalDateTime.of(2023, 6, 1, 10, 30);
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);
        System.out.println("Converted Date: " + date);

        // 13. Use TemporalAdjuster to get next Sunday
        LocalDate today = LocalDate.now();
        LocalDate nextSunday = today.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("Next Sunday: " + nextSunday);

        // 14. Calculate difference in days between two LocalDate objects
        LocalDate startDate = LocalDate.of(2023, 6, 1);
        LocalDate endDate = LocalDate.of(2023, 6, 15);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Days between: " + daysBetween);

        // 15. Convert java.util.Date to LocalDateTime
        Date javaDate = new Date();
        Instant instantFromJavaDate = javaDate.toInstant();
        LocalDateTime localDateTimeFromJavaDate = LocalDateTime.ofInstant(instantFromJavaDate, ZoneId.systemDefault());
        System.out.println("Converted LocalDateTime from java.util.Date: " + localDateTimeFromJavaDate);

        // 16. Format LocalDateTime to string
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);

        // 17. Parse string to LocalDateTime
        String dateTimeStr = "2023-06-01 15:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeStr, formatter);
        System.out.println("Parsed DateTime: " + parsedDateTime);

        // 18. Calculate duration between two LocalTime objects
        LocalTime startTime = LocalTime.of(10, 0);
        LocalTime endTime = LocalTime.of(12, 30);
        Duration duration = Duration.between(startTime, endTime);
        long minutes = duration.toMinutes();
        System.out.println("Meeting duration in minutes: " + minutes);

        // 19. Determine if a given year is leap year
        int year = 2023;
        boolean isLeapYear = Year.of(year).isLeap();
        System.out.println(year + " is leap year? " + isLeapYear);

        // 20. Convert java.sql.Date to LocalDate
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        LocalDate localDate = sqlDate.toLocalDate();
        System.out.println("Converted LocalDate from java.sql.Date: " + localDate);
    }
}
