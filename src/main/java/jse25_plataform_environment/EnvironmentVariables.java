package jse25_plataform_environment;

import java.util.Map;

public class EnvironmentVariables {

    /**
     * As variaveis de ambiente sao utilizadas pelo sistema operacional para passar informacoes entre aplicacoes
     *
     * Da mesma forma como os properties, as variaveis de ambiente sao chave/valor
     *
     * Atraves do metodo System.getenv eh possivel recuperar todas as variais de ambiente em um map, ou apenas uma
     * especifica utilizando o nome da variavel como parametro
     */

    public static void main(String[] args) {
        Map<String, String> variables = System.getenv();

        for (Map.Entry<String, String> variable : variables.entrySet()) {
            System.out.println(variable.getKey() + "=" + variable.getValue());
        }
    }

}
