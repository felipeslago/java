package jse25_plataform_environment;

import java.util.Map;
import java.util.Properties;

public class SystemProperties {

    /**
     * Assim como qualquer aplicacao, a plataforma Java possui propriedades pre-definidas, que podem ser acessadas
     * atraves do metodo System.getProperties ou System.getProperty
     *
     * Essas propriedades podem ser lidas e tambem modificadas, atraves do metodo System.setProperties ou
     * System.setProperty
     */

    public static void main(String[] args) {
        Properties properties = System.getProperties();

        for (Map.Entry<Object, Object> property : properties.entrySet()) {
            System.out.println(property.getKey() + "=" + property.getValue());
        }
    }

}
