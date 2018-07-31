package jse25.plataformEnvironment;

public class CommandLineArguments {

    /**
     * A assinatura padrao do metodo main sempre recebe um array de Strings
     *
     * Esse array sao os argumentos que podemos passar para o programa na chamada da sua execucao
     *
     * Para executar este programa, navegue até o diretorio root da aplicacao e execute os comandos:
     *
     * javac -d "out" "src/main/java/jse25/plataformEnvironment/CommandLineArguments.java"
     *
     * java -classpath "out" jse25.plataformEnvironment.CommandLineArguments t e s t
     *
     * O primeiro comando esta compilando a classe e colocando o resultado da compilacao na pasta out
     *
     * Ja o segundo comando esta executando o compilado dentro da pasta out passando como argumento t e s t
     *
     * Os argumentos devem ser separados por espacos em branco e caso queira passar um texto, deve-se utilizar aspas
     */

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

}
