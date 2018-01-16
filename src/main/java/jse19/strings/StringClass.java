package jse19.strings;

public class StringClass {

    public static void main(String[] args) {

        /**
         * Uma String e um objeto que contem uma sequencia de caracteres As variaveis do tipo String mantem a referencia
         * da memoria de um objeto e nao o seu valor (como um tipo primitivo)
         */

        /**
         * Uma string pode ser criada atraves de uma atribucao direta de valor ou usando a palavra new
         */

        String hello = "Hello";

        char[] worldChar = { 'W', 'o', 'r', 'l', 'd' };

        String world = new String(worldChar);

        /**
         * e possivel obter o tamanho da string atraves do metodo length
         */

        int size = hello.length();

        /**
         * O metodo concat concatena duas strings
         */

        String helloWorld = hello.concat(world);

        System.out.println(helloWorld);

        /**
         * Embora possam ter o mesmo valor, duas strings sao objetos diferentes na memoria Sendo assim, o operador ==
         * ira comparar o endereco de memoria (hashCode) e nao o valor das variaveis
         *
         * Ja o metodo equals, que foi reescrito pelo criador da classe String, compara o conteudo de cada objeto String
         *
         * Nao se esqueca de olhar dentro da classe String e averiguar que o metodo hashCode tambem foi reescrito
         */

        System.out.println(hello == world);
        System.out.println(world.equals(hello));

        /**
         * O metodo format auxilia na formatacao de um string O sinal de % seguido de um qualificador (f, d, s) indica a
         * insercao de um parametro Os parametros sao especificados logo apos o fim da string, separados por virgula,
         * seguindo a ordem em que foram declarados
         */

        int n1 = 10;
        int n2 = 5;

        String sum = String.format("O resultado de %d + %d e igual a %d", n1, n2, n1 + n2);

        System.out.println(sum);

        /**
         * Utilizando o operador + e possivel concatenar uma string com qualquer objeto
         */

        String number = "Numero " + 10;
        System.out.println(number);

        /**
         * O metodo split separa uma String em uma array de String a partir de um caracter especificado, no caso abaixo,
         * por um espaco
         */

        String phrase = "O Java e demais";
        String[] words = phrase.split(" ");

        for (String word : words) {
            System.out.print(word + " ");
        }

        /**
         * O metodo compareTo indica se duas Strings sao iguais Os possiveis resultados sao: - zero se forem iguais -
         * inteiro negativo se for menor que (ordem alfabetica) - inteiro positivo se for maior que (ordem alfabetica)
         */

        String a = "a";
        String b = "b";

        System.out.println(a.compareTo(b));

        /**
         * Os metodos toUpperCase e toLowerCase transformam a String para caixa maiuscula ou minuscula
         */

        a.toUpperCase(); // Porem o metodo retorna uma nova String, ou seja, o valor de a nao sera modificado
        System.out.println(a);

        /**
         * Todos os metodos da classe String sempre retornam um novo objeto, nunca alteram o objeto atual, portanto para
         * armazenar o resultado e necessario fazer uma nova atribuicao
         */

        a = a.toUpperCase();

        System.out.println(a);

        a = a.toLowerCase();

        /**
         * O metodo replace substitui ocorrencias de caracteres por outros
         */

        a = a.replace("a", "b");

        System.out.println(a);

        /**
         * Tambem e possivel chamar um metodo seguido do outro
         */

        a = a.toUpperCase().replace("B", "A");

        System.out.println(a);

        /**
         * O metodo charAt retorna um caracter na posicao especifica
         */

        System.out.println(phrase.charAt(6));

        /**
         * O metodo substring retorna uma nova String a partir de uma posicao
         */

        System.out.println(phrase.substring(3));

        /**
         * O metodo indexOf retorna a posicao da primeira ocorrencia encontrada de uma determinada sequencia de
         * caracteres
         */

        System.out.println(phrase.indexOf("a"));

        /**
         * O metodo lastIndexOf retorna a posicao da ultima ocorrencia encontrada de uma determinada sequencia de
         * caracteres
         */

        System.out.println(phrase.lastIndexOf("a"));

        /**
         * O metodo isEmpty retorna um booleano indicando se a String esta vazia
         */

        System.out.println(phrase.isEmpty());

        /**
         * O metodo contains retorna um boolean indicando se uma String possui determinada sequencia de caracteres
         */

        System.out.println(phrase.contains("is"));

    }

}
