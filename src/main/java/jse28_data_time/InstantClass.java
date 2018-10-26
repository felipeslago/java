package jse28_data_time;

import java.time.Instant;

public class InstantClass {

    /**
     * Uma das principais classes da API de Data do Java eh a Instant, que gera um ponto na linha do tempo, representado
     * em nanosegundos
     *
     * Essa classe eh muito util para gerar um time stamp que representa o tempo da maquina
     */

    public static void main(String[] args) {
        Instant instant = Instant.now();

        System.out.println(instant.getNano());
        System.out.println(instant);
    }

}
