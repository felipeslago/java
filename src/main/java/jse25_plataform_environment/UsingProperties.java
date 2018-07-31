package jse25_plataform_environment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class UsingProperties {

    /**
     * Muitas aplicacoes utilizam arquivos de properties para parametrizar configuracoes de inicializacao
     *
     * Essas configuracoes podem ser as mais diversas possiveis, desde alterar o funcionamento da aplicacao, especificar
     * o bando de dados a ser utilizado, ate interagir com frameworks de mercado
     *
     * Os properties sao arquivos de chave/valor, atribuidos no padrao string=string, ex.: teste=123456
     *
     * Para lidar com arquivos de properties, podem utilizar a classe Properties
     *
     * O arquivo pode ser carregado diretamente atraves de um arquivo de texto comum, usando o metodo load e tambem pode
     * ser salvo utilizando o metodo store
     *
     * Propriedades novas podem ser adicionar atraves do metodo put
     */

    public static void main(String[] args) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream("out/properties")) {
            Properties propertiesToSave = new Properties();
            propertiesToSave.put("test", "123456");
            propertiesToSave.store(outputStream, "");
        }

        try (FileInputStream in = new FileInputStream("out/properties")) {
            Properties propertiesToLoad = new Properties();
            propertiesToLoad.load(in);

            System.out.println(propertiesToLoad.getProperty("test"));
        }
    }

}
