package jse19.strings;

public class StringClass {

    public static void main (String[] args) {

        /**
         * Uma String � uma sequ�ncia de caracteres
         * As vari�veis do tipo String mant�m a refer�ncia de um objeto e n�o o seu valor (como um tipo primitivo)
         */

        String a = "abcdefghijklmnopq";
        String b = "abcdefghijklmnopq";

        /**
         * Embora tenham o mesmo valor, a e b s�o objetos diferentes na mem�ria
         * Sendo assim, o operador == ir� comparar o endere�o de mem�ria (hashCode) e n�o o valor das vari�veis
         * J� o m�todo equals, que foi reescrito pelo criador da classe String, compara o conte�do de cada objeto String
         * N�o se esque�a de olhar dentro da classe String e averiguar que o m�todo hashCode tamb�m foi reescrito
         */

        System.out.println(a == b);
        System.out.println(a.equals(b));

        String number = "N�mero " + 10; // � poss�vel concatenar uma String com qualquer objeto
        System.out.println(number);

        /**
         * O m�todo split separa uma String em uma array de String a partir de um caracter especificado, no caso abaixo, por um espa�o
         */

        String phrase = "O Java � demais";
        String[] words = phrase.split(" ");

        for (String word : words) {
            System.out.print(word + " ");
        }

        /**
         * O m�todo compareTo indica se duas Strings s�o iguais
         * Os poss�veis resultados s�o:
         * - zero se forem iguais
         * - inteiro negativo se for menor que (ordem alfab�tica)
         * - inteiro positivo se for maior que (ordem alfab�tica)
         */

        System.out.println(a.compareTo(b));

        /**
         * Os m�todos toUpperCase e toLowerCase transformam a String para caixa mai�scula ou min�scula
         */

        a.toUpperCase(); // Por�m o m�todo retorna uma nova String, ou seja, o valor de a n�o ser� modificado
        System.out.println(a);

        a = a.toUpperCase(); // Para o valor de a ser modificado, � precisa fazer a atribui��o com o operador =

        System.out.println(a);

        a = a.toLowerCase();

        /**
         * Isso vale para todos os m�todos da classe String, pois sempre retornam um novo objeto e n�o alteram o seu valor
         */

        a = a.replace("a", "b"); // O m�todo replace substitui ocorr�ncias de caracteres por outros

        System.out.println(a);

        a = a.toUpperCase().replace("B", "A"); // Tamb�m � poss�vel chamar um m�todo seguido do outro

        System.out.println(a);

        System.out.println(phrase.charAt(6)); // O m�todo charAt retorna um caracter na posi��o espec�fica

        System.out.println(phrase.length()); // O m�todo length retorna o tamanho da String (quantidade de caracteres)

        System.out.println(phrase.substring(3)); // O m�todo substring retorna uma nova String a partir de uma posi��o

        /**
         * O m�todo indexOf retorna a posi��o da primeira ocorr�ncia encontrada de uma determinada sequ�ncia de caracteres
         */

        System.out.println(phrase.indexOf("a"));

        /**
         * O m�todo lastIndexOf retorna a posi��o da �ltima ocorr�ncia encontrada de uma determinada sequ�ncia de caracteres
         */

        System.out.println(phrase.lastIndexOf("a"));

        System.out.println(phrase.isEmpty()); // O m�todo isEmpty retorna um booleano indicando se a String est� vazia

        /**
         * O m�todo contains retorna um boolean indicando se uma String possu� determinada sequ�ncia de caracteres
         */

        System.out.println(phrase.contains("is"));

    }

}
