import java.text.DateFormatSymbols;
import java.util.*;

public class $2_GregorianCalender {
    /**
     * There are many calendar around the world.
     * Eg: Japanese, Asia, Jewish, Lunar.
     * We follow Gregorian calendar
     *
     * */
    public static void main(String[] args) {
        {




            GregorianCalendar gc = new GregorianCalendar();

            System.out.println(gc.isLeapYear(2024)); // true
            System.out.println(gc.get(Calendar.DATE));
            System.out.println(gc.get(Calendar.MONTH));
            System.out.println(gc.get(Calendar.DAY_OF_WEEK));
            System.out.println(gc.get(Calendar.DAY_OF_YEAR));
            // There are various methods present in the Calendar Class = You can explore them.
        }

        //? Time Zone - Part of Gregorian Time Zone
        {
            GregorianCalendar gc = new GregorianCalendar();
            TimeZone tz = gc.getTimeZone();

            System.out.println(tz);
            System.out.println(tz.getDisplayName()); // Eastern Standard Time
            System.out.println(tz.getID()); // America/Toronto


            // We can change the TIME ZONE
            GregorianCalendar g = new GregorianCalendar();
            g.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));

            TimeZone tz2 = g.getTimeZone();
            System.out.println(tz2.getDisplayName());
            int day = g.get(GregorianCalendar.DATE);
            int month = g.get(GregorianCalendar.MONTH);
            String monthName = new DateFormatSymbols().getMonths()[month];
            int year = g.get(GregorianCalendar.YEAR);



            System.out.println(day + " "+ monthName + " "+ year);

        }
    }
}
