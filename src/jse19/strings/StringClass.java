package jse19.strings;

public class StringClass {

    public static void main (String[] args) {

        /**
         * Uma String é uma sequência de caracteres
         * As variáveis do tipo String mantém a referência de um objeto e não o seu valor (como um tipo primitivo)
         */

        String a = "abcdefghijklmnopq";
        String b = "abcdefghijklmnopq";

        /**
         * Embora tenham o mesmo valor, a e b são objetos diferentes na memória
         * Sendo assim, o operador == irá comparar o endereço de memória (hashCode) e não o valor das variáveis
         * Já o método equals, que foi reescrito pelo criador da classe String, compara o conteúdo de cada objeto String
         * Não se esqueça de olhar dentro da classe String e averiguar que o método hashCode também foi reescrito
         */

        System.out.println(a == b);
        System.out.println(a.equals(b));

        String number = "Número " + 10; // É possível concatenar uma String com qualquer objeto
        System.out.println(number);

        /**
         * O método split separa uma String em uma array de String a partir de um caracter especificado, no caso abaixo, por um espaço
         */

        String phrase = "O Java é demais";
        String[] words = phrase.split(" ");

        for (String word : words) {
            System.out.print(word + " ");
        }

        /**
         * O método compareTo indica se duas Strings são iguais
         * Os possíveis resultados são:
         * - zero se forem iguais
         * - inteiro negativo se for menor que (ordem alfabética)
         * - inteiro positivo se for maior que (ordem alfabética)
         */

        System.out.println(a.compareTo(b));

        /**
         * Os métodos toUpperCase e toLowerCase transformam a String para caixa maiúscula ou minúscula
         */

        a.toUpperCase(); // Porém o método retorna uma nova String, ou seja, o valor de a não será modificado
        System.out.println(a);

        a = a.toUpperCase(); // Para o valor de a ser modificado, é precisa fazer a atribuição com o operador =

        System.out.println(a);

        a = a.toLowerCase();

        /**
         * Isso vale para todos os métodos da classe String, pois sempre retornam um novo objeto e não alteram o seu valor
         */

        a = a.replace("a", "b"); // O método replace substitui ocorrências de caracteres por outros

        System.out.println(a);

        a = a.toUpperCase().replace("B", "A"); // Também é possível chamar um método seguido do outro

        System.out.println(a);

        System.out.println(phrase.charAt(6)); // O método charAt retorna um caracter na posição específica

        System.out.println(phrase.length()); // O método length retorna o tamanho da String (quantidade de caracteres)

        System.out.println(phrase.substring(3)); // O método substring retorna uma nova String a partir de uma posição

        /**
         * O método indexOf retorna a posição da primeira ocorrência encontrada de uma determinada sequência de caracteres
         */

        System.out.println(phrase.indexOf("a"));

        /**
         * O método lastIndexOf retorna a posição da última ocorrência encontrada de uma determinada sequência de caracteres
         */

        System.out.println(phrase.lastIndexOf("a"));

        System.out.println(phrase.isEmpty()); // O método isEmpty retorna um booleano indicando se a String está vazia

        /**
         * O método contains retorna um boolean indicando se uma String possuí determinada sequência de caracteres
         */

        System.out.println(phrase.contains("is"));

    }

}
