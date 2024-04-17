import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class $3_JodaTimeAndDate {
    public static void main(String[] args) {

        // Java Date & Time API


        // seconds & nanoseconds
        // Immutable


        LocalDate dt = LocalDate.now();
        System.out.println(dt);

        LocalDate dt2 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(dt2); // 2024-04-15


        // There is another method
        LocalDate dt3 = LocalDate.of(2020, Month.MARCH, 14);
        System.out.println(dt3);

        System.out.println(LocalDate.MAX); // +999999999-12-31
        System.out.println(LocalDate.MIN); // -999999999-01-01
        System.out.println(LocalDate.ofEpochDay(1)); // add [number] to 01-01-1970


        LocalDate dt4  = LocalDate.parse("2024-04-14");
        System.out.println(dt4); // 2024-04-14


        System.out.println(LocalDate.now().plusMonths(6)); // 2024-10-14
        // In the above example,
        // If you write dt4..plusMonths() => It will not change dt4, instead it will create a new reference and point to it.


        //? Same way is LocalTime / LocalDateTime
    }
}
