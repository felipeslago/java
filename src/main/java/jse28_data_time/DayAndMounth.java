package jse28_data_time;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayAndMounth {

    /**
     * As classes DayOfWeek e Month possibilitam tratar apenas com dias da semana e meses de maneira mais simples, sem
     * precisar utilizar uma data inteira
     */

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;

        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault()));

        dayOfWeek = dayOfWeek.plus(1);

        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault()));

        Month month = Month.JANUARY;

        System.out.println(month.getDisplayName(TextStyle.FULL, Locale.getDefault()));

        month = month.plus(1);

        System.out.println(month.getDisplayName(TextStyle.FULL, Locale.getDefault()));
    }

}
