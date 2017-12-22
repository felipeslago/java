package jse16.inheritance;

public class ObjectAsSuperClass implements Cloneable {

    int value;

    String text;

    /**
     * Todas as classes, por mais que n�o seja vis�vel, extendem da super classe Object
     * Com isso, alguns m�todos dessa super classe ficam dispon�veis para uso assim que um objeto � instanciado
     * Abaixo ser�o exibidos alguns m�todos da classe Object que pode ser utilizados
     */

    public static void main (String[] args) throws CloneNotSupportedException {
        ObjectAsSuperClass objectAsSuperClass = new ObjectAsSuperClass();
        objectAsSuperClass.value = 10;
        objectAsSuperClass.text = "created";

        /**
         * Se tivermos dois objetos
         *      Object o1 = new Object;
         *      Object o2 = new Object;
         * E fizermos uma atribui��o usando o sinal de =
         *      o2 = o1;
         * Estamos dizendo que o2 est� referenciando o mesmo endere�o de mem�ria que o1 referencia
         * Com isso, tudo o que for alterado em o1, ser� alterado em o2 e vice versa, visto que os dois objetos apontam para o mesmo endere�o de mem�ria
         *
         * Por�m, algumas vezes queremos criar uma inst�ncia nova a partir de um objeto existente, preservando seus valores
         * O m�todo clone possibilita isso
         */

        ObjectAsSuperClass objectAsSuperClassClone = (ObjectAsSuperClass) objectAsSuperClass
                .clone(); // Note que esse m�todo retorna um objeto, portanto � necess�rio fazer o cast
        System.out.println("Value: " + objectAsSuperClassClone.value);
        System.out.println("Text: " + objectAsSuperClassClone.text);

        /**
         * O m�todo equals fornece uma maneira de comparar dois objetos
         * Essa compara��o � feita atrav�s do operador ==
         * Dessa maneira, apenas objetos do tipo primitivo seriam considerados iguais
         * Se duas inst�ncias diferentes (n�o apontando para o mesmo endere�o de mem�ria) forem comparadas, o resultado sempre ser� falso
         */

        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println("o1 � igual a o2: " + o1.equals(o2));

        o1 = o2;

        System.out.println("o1 � igual a o2: " + o1.equals(o2));

        /**
         * O m�todo hashcode prov� o endere�o de mem�ria em que o objeto est� alocado, representado em hexadecimal
         */

        o1 = new Object();

        System.out.println("Endere�o de mem�ria de o1: " + o1.hashCode());
        System.out.println("Endere�o de mem�ria de o2: " + o2.hashCode());

        /**
         * O m�todo toString devolve uma String que representa o objeto
         */

        System.out.println("String de o1: " + o1.toString());
        System.out.println("String de o2: " + o2.toString());
    }

    class Overriding {

        int value;

        /**
         * Todos os m�todos da super classe Object podem ser reescritos (@override), dando assim o toque de cada programador
         */

        @Override
        public boolean equals (
                final Object obj) { // Como por exemplo, reescrever o m�todo para comparar cada campo de um objeto, ao inv�s do seu endere�o de mem�ria
            Overriding obj2 = (Overriding) obj;
            return value == obj2.value;
        }

        /**
         * Por defini��o, se dois objetos s�o iguais, o seu hashcode deve ser o mesmo.
         * Portanto se voc� reescrever o m�todo equals, voc� deve reescrever tamb�m o m�todo hashcode.
         */

        @Override
        public int hashCode () {
            return value;
        }

        @Override
        public String toString () { // Ou ainda, reescrever o m�todo toString, para devolver uma String de todos os campos presentes
            return "Value: " + value;
        }

        @Override
        protected void finalize ()
                throws Throwable { // O m�todo finalize � chamada assim que o objeto � destru�do pelo garbage colector
            super.finalize();
            System.out.println("I'm dead.");
        }
    }

}
