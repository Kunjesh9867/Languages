import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeZone {
    public static void main(String[] args) {



        String pattern = "hh:mm a   ";



        System.out.println("-----CANADA-----");
        int day = LocalDate.now().getDayOfMonth();
        Month month = LocalDate.now().getMonth();
        int year = LocalDate.now().getYear();

        int time = LocalTime.now().getHour();
        int minutes = LocalTime.now().getMinute();


//        if(time > 12){
//            time = time%12;
//        }
//        System.out.println(time + ":"+ minutes + " ["+ day + " "+ month + ", "+ year+ "]");
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern(pattern)));


        // INDIA
        System.out.println("-----INDIA-----");
        LocalDateTime india = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        int indiaDay = india.getDayOfMonth();
        Month indiaMonth = india.getMonth();
        int indiaYear = india.getYear();

        int indiaHour = india.getHour();
        int indiaMinutes = india.getMinute();

        if(indiaHour > 12){
            indiaHour = indiaHour%12;
        }





    }
}
