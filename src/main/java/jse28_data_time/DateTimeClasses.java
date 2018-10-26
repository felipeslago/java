package jse28_data_time;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeClasses {

    /**
     * As classes LocalTime e LocalDateTime permitem trabalhar com datas e horas sem a necessidade do uso de time zone
     */

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();

        System.out.println(localTime.toString());

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);
    }

}
