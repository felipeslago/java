package jse19.strings;

public class StringClass {

    public static void main(String[] args) {

        /**
         * Uma String � um objeto que cont�m uma sequ�ncia de caracteres As vari�veis do tipo String mant�m a refer�ncia
         * da mem�ria de um objeto e n�o o seu valor (como um tipo primitivo)
         */

        /**
         * Uma string pode ser criada atrav�s de uma atribu��o direta de valor ou usando a palavra new
         */

        String hello = "Hello";

        char[] worldChar = { 'W', 'o', 'r', 'l', 'd' };

        String world = new String(worldChar);

        /**
         * � poss�vel obter o tamanho da string atrav�s do m�todo length
         */

        int size = hello.length();

        /**
         * O m�todo concat concatena duas strings
         */

        String helloWorld = hello.concat(world);

        System.out.println(helloWorld);

        /**
         * Embora possam ter o mesmo valor, duas strings s�o objetos diferentes na mem�ria Sendo assim, o operador ==
         * ir� comparar o endere�o de mem�ria (hashCode) e n�o o valor das vari�veis
         *
         * J� o m�todo equals, que foi reescrito pelo criador da classe String, compara o conte�do de cada objeto String
         *
         * N�o se esque�a de olhar dentro da classe String e averiguar que o m�todo hashCode tamb�m foi reescrito
         */

        System.out.println(hello == world);
        System.out.println(world.equals(hello));

        /**
         * O m�todo format auxilia na formata��o de um string O sinal de % seguido de um qualificador (f, d, s) indica a
         * inser��o de um par�metro Os par�metros s�o especificados logo ap�s o fim da string, separados por v�rgula,
         * seguindo a ordem em que foram declarados
         */

        int n1 = 10;
        int n2 = 5;

        String sum = String.format("O resultado de %d + %d � igual a %d", n1, n2, n1 + n2);

        System.out.println(sum);

        /**
         * Utilizando o operador + � poss�vel concatenar uma string com qualquer objeto
         */

        String number = "N�mero " + 10;
        System.out.println(number);

        /**
         * O m�todo split separa uma String em uma array de String a partir de um caracter especificado, no caso abaixo,
         * por um espa�o
         */

        String phrase = "O Java � demais";
        String[] words = phrase.split(" ");

        for (String word : words) {
            System.out.print(word + " ");
        }

        /**
         * O m�todo compareTo indica se duas Strings s�o iguais Os poss�veis resultados s�o: - zero se forem iguais -
         * inteiro negativo se for menor que (ordem alfab�tica) - inteiro positivo se for maior que (ordem alfab�tica)
         */

        String a = "a";
        String b = "b";

        System.out.println(a.compareTo(b));

        /**
         * Os m�todos toUpperCase e toLowerCase transformam a String para caixa mai�scula ou min�scula
         */

        a.toUpperCase(); // Por�m o m�todo retorna uma nova String, ou seja, o valor de a n�o ser� modificado
        System.out.println(a);

        /**
         * Todos os m�todos da classe String sempre retornam um novo objeto, nunca alteram o objeto atual, portanto para
         * armazenar o resultado � necess�rio fazer uma nova atribui��o
         */

        a = a.toUpperCase();

        System.out.println(a);

        a = a.toLowerCase();

        /**
         * O m�todo replace substitui ocorr�ncias de caracteres por outros
         */

        a = a.replace("a", "b");

        System.out.println(a);

        /**
         * Tamb�m � poss�vel chamar um m�todo seguido do outro
         */

        a = a.toUpperCase().replace("B", "A");

        System.out.println(a);

        /**
         * O m�todo charAt retorna um caracter na posi��o espec�fica
         */

        System.out.println(phrase.charAt(6));

        /**
         * O m�todo substring retorna uma nova String a partir de uma posi��o
         */

        System.out.println(phrase.substring(3));

        /**
         * O m�todo indexOf retorna a posi��o da primeira ocorr�ncia encontrada de uma determinada sequ�ncia de
         * caracteres
         */

        System.out.println(phrase.indexOf("a"));

        /**
         * O m�todo lastIndexOf retorna a posi��o da �ltima ocorr�ncia encontrada de uma determinada sequ�ncia de
         * caracteres
         */

        System.out.println(phrase.lastIndexOf("a"));

        /**
         * O m�todo isEmpty retorna um booleano indicando se a String est� vazia
         */

        System.out.println(phrase.isEmpty());

        /**
         * O m�todo contains retorna um boolean indicando se uma String possu� determinada sequ�ncia de caracteres
         */

        System.out.println(phrase.contains("is"));

    }

}
