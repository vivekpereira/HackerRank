import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.text.DateFormatSymbols;
public class Solution {
    public static String getDay(String day, String month, String year) {
        DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
        String weekdays[] = dfs.getWeekdays();
        Calendar cal = new GregorianCalendar(Locale.US);
        cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
        return weekdays[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase();
        

        
    }