package jse28_data_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeZoneAndOffset {

    /**
     * Um Time Zone eh uma regiao da terra onde o mesmo padrao de tempo eh utilizado, em que eh descrito por
     * regiao/cidade
     *
     * Um Offset eh uma representacao de fuso horario entre locais da terra, descrito por Greenwich/UTC
     *
     * As Date Time Classes possuem tres principais classes:
     *
     * ZonedDateTime: armazena data e hora com uma time zone
     *
     * OffsetDateTime: armazena data e hora com com um offset, sem time zone
     *
     * OffsetTime: armazena apenas hora com com um offset, sem time zone
     */

    public static void main(String[] args) {
        for (String s : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(s);

            LocalDateTime localDateTime = LocalDateTime.now(zoneId);

            ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId).withZoneSameLocal(zoneId);

            ZoneOffset zoneOffset = zonedDateTime.getOffset();

            System.out.println(String.format("%35s %10s %20s", zoneId, zoneOffset, zonedDateTime.toLocalDateTime()));
        }
    }
}
