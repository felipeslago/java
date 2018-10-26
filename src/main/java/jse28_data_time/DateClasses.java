package jse28_data_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class DateClasses {

    /**
     * As classes LocalDate, YearMonth, MonthDay e Year permitem trabalhar com datas sem a necessidade do uso de time
     * zone
     */

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2000, Month.JANUARY, 1);

        System.out.println(localDate.toString());

        YearMonth yearMonth = YearMonth.now();

        System.out.println(yearMonth.toString());

        MonthDay monthDay = MonthDay.now();

        System.out.println(monthDay.toString());

        Year year = Year.now();

        System.out.println(year.toString());
    }

}
