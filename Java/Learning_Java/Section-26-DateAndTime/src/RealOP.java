import org.w3c.dom.ls.LSOutput;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class RealOP {
    public static void main(String[] args) {
        // Canada
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm a");

        LocalDate localDate = LocalDate.now();
        int localDay = localDate.getDayOfMonth();
        Month localMonth = localDate.getMonth();
        int localYear = localDate.getYear();
        System.out.println("----- Canada -----");
        System.out.println(localDay + " " + localMonth + ", " + localYear);
        System.out.println(localTime.format(f) +  " ("+ localDate.getDayOfWeek() + ")");
        System.out.println("-----------------");


        System.out.println("\n\n\n\n\n\n");
        // INDIA
        LocalTime india = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        LocalDate indiaDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        int indiaDay = indiaDate.getDayOfMonth();
        Month indiaMonth = indiaDate.getMonth();
        int indiaYear = indiaDate.getYear();



        System.out.println("----- India -----");
        System.out.println(indiaDay + " " + indiaMonth + ", " + indiaYear);

        System.out.println(india.format(f) + " ("+ indiaDate.getDayOfWeek() + ")");
        System.out.println("-----------------");
    }





}
