import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class Solution {

    private static String getDay(String day, String month, String year) {
        // Java 8
        return LocalDate.of(Integer.parseInt(year), (Integer.parseInt(month)), Integer.parseInt(day)).getDayOfWeek().toString();
    }

    // Java 7
    private static String getDay_Java7(String day, String month, String year) {
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
        System.out.println(c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase());
    }
}