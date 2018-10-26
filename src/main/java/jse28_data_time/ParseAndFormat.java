package jse28_data_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseAndFormat {

    /**
     * A classe DateTimeFormatter pode ser utilizada no parse e na formatacao de uma data
     */

    public static void main(String[] args) {
        String dateStr = "2000-01-01";
        LocalDate localDate = LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM d yyyy");
        String out = localDate.format(dateTimeFormatter);
        System.out.println(out);
    }

}
