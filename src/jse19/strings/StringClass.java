package jse19.strings;

public class StringClass {

    public static void main(String[] args) {

        /**
         * Uma String é um objeto que contém uma sequência de caracteres As variáveis do tipo String mantém a referência
         * da memória de um objeto e não o seu valor (como um tipo primitivo)
         */

        /**
         * Uma string pode ser criada através de uma atribução direta de valor ou usando a palavra new
         */

        String hello = "Hello";

        char[] worldChar = { 'W', 'o', 'r', 'l', 'd' };

        String world = new String(worldChar);

        /**
         * É possível obter o tamanho da string através do método length
         */

        int size = hello.length();

        /**
         * O método concat concatena duas strings
         */

        String helloWorld = hello.concat(world);

        System.out.println(helloWorld);

        /**
         * Embora possam ter o mesmo valor, duas strings são objetos diferentes na memória Sendo assim, o operador ==
         * irá comparar o endereço de memória (hashCode) e não o valor das variáveis
         *
         * Já o método equals, que foi reescrito pelo criador da classe String, compara o conteúdo de cada objeto String
         *
         * Não se esqueça de olhar dentro da classe String e averiguar que o método hashCode também foi reescrito
         */

        System.out.println(hello == world);
        System.out.println(world.equals(hello));

        /**
         * O método format auxilia na formatação de um string O sinal de % seguido de um qualificador (f, d, s) indica a
         * inserção de um parâmetro Os parâmetros são especificados logo após o fim da string, separados por vírgula,
         * seguindo a ordem em que foram declarados
         */

        int n1 = 10;
        int n2 = 5;

        String sum = String.format("O resultado de %d + %d é igual a %d", n1, n2, n1 + n2);

        System.out.println(sum);

        /**
         * Utilizando o operador + é possível concatenar uma string com qualquer objeto
         */

        String number = "Número " + 10;
        System.out.println(number);

        /**
         * O método split separa uma String em uma array de String a partir de um caracter especificado, no caso abaixo,
         * por um espaço
         */

        String phrase = "O Java é demais";
        String[] words = phrase.split(" ");

        for (String word : words) {
            System.out.print(word + " ");
        }

        /**
         * O método compareTo indica se duas Strings são iguais Os possíveis resultados são: - zero se forem iguais -
         * inteiro negativo se for menor que (ordem alfabética) - inteiro positivo se for maior que (ordem alfabética)
         */

        String a = "a";
        String b = "b";

        System.out.println(a.compareTo(b));

        /**
         * Os métodos toUpperCase e toLowerCase transformam a String para caixa maiúscula ou minúscula
         */

        a.toUpperCase(); // Porém o método retorna uma nova String, ou seja, o valor de a não será modificado
        System.out.println(a);

        /**
         * Todos os métodos da classe String sempre retornam um novo objeto, nunca alteram o objeto atual, portanto para
         * armazenar o resultado é necessário fazer uma nova atribuição
         */

        a = a.toUpperCase();

        System.out.println(a);

        a = a.toLowerCase();

        /**
         * O método replace substitui ocorrências de caracteres por outros
         */

        a = a.replace("a", "b");

        System.out.println(a);

        /**
         * Também é possível chamar um método seguido do outro
         */

        a = a.toUpperCase().replace("B", "A");

        System.out.println(a);

        /**
         * O método charAt retorna um caracter na posição específica
         */

        System.out.println(phrase.charAt(6));

        /**
         * O método substring retorna uma nova String a partir de uma posição
         */

        System.out.println(phrase.substring(3));

        /**
         * O método indexOf retorna a posição da primeira ocorrência encontrada de uma determinada sequência de
         * caracteres
         */

        System.out.println(phrase.indexOf("a"));

        /**
         * O método lastIndexOf retorna a posição da última ocorrência encontrada de uma determinada sequência de
         * caracteres
         */

        System.out.println(phrase.lastIndexOf("a"));

        /**
         * O método isEmpty retorna um booleano indicando se a String está vazia
         */

        System.out.println(phrase.isEmpty());

        /**
         * O método contains retorna um boolean indicando se uma String possuí determinada sequência de caracteres
         */

        System.out.println(phrase.contains("is"));

    }

}
