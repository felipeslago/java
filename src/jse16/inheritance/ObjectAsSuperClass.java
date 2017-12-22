package jse16.inheritance;

public class ObjectAsSuperClass implements Cloneable {

    int value;

    String text;

    /**
     * Todas as classes, por mais que não seja visível, extendem da super classe Object
     * Com isso, alguns métodos dessa super classe ficam disponíveis para uso assim que um objeto é instanciado
     * Abaixo serão exibidos alguns métodos da classe Object que pode ser utilizados
     */

    public static void main (String[] args) throws CloneNotSupportedException {
        ObjectAsSuperClass objectAsSuperClass = new ObjectAsSuperClass();
        objectAsSuperClass.value = 10;
        objectAsSuperClass.text = "created";

        /**
         * Se tivermos dois objetos
         *      Object o1 = new Object;
         *      Object o2 = new Object;
         * E fizermos uma atribuição usando o sinal de =
         *      o2 = o1;
         * Estamos dizendo que o2 está referenciando o mesmo endereço de memória que o1 referencia
         * Com isso, tudo o que for alterado em o1, será alterado em o2 e vice versa, visto que os dois objetos apontam para o mesmo endereço de memória
         *
         * Porém, algumas vezes queremos criar uma instância nova a partir de um objeto existente, preservando seus valores
         * O método clone possibilita isso
         */

        ObjectAsSuperClass objectAsSuperClassClone = (ObjectAsSuperClass) objectAsSuperClass
                .clone(); // Note que esse método retorna um objeto, portanto é necessário fazer o cast
        System.out.println("Value: " + objectAsSuperClassClone.value);
        System.out.println("Text: " + objectAsSuperClassClone.text);

        /**
         * O método equals fornece uma maneira de comparar dois objetos
         * Essa comparação é feita através do operador ==
         * Dessa maneira, apenas objetos do tipo primitivo seriam considerados iguais
         * Se duas instâncias diferentes (não apontando para o mesmo endereço de memória) forem comparadas, o resultado sempre será falso
         */

        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println("o1 é igual a o2: " + o1.equals(o2));

        o1 = o2;

        System.out.println("o1 é igual a o2: " + o1.equals(o2));

        /**
         * O método hashcode provê o endereço de memória em que o objeto está alocado, representado em hexadecimal
         */

        o1 = new Object();

        System.out.println("Endereço de memória de o1: " + o1.hashCode());
        System.out.println("Endereço de memória de o2: " + o2.hashCode());

        /**
         * O método toString devolve uma String que representa o objeto
         */

        System.out.println("String de o1: " + o1.toString());
        System.out.println("String de o2: " + o2.toString());
    }

    class Overriding {

        int value;

        /**
         * Todos os métodos da super classe Object podem ser reescritos (@override), dando assim o toque de cada programador
         */

        @Override
        public boolean equals (
                final Object obj) { // Como por exemplo, reescrever o método para comparar cada campo de um objeto, ao invés do seu endereço de memória
            Overriding obj2 = (Overriding) obj;
            return value == obj2.value;
        }

        /**
         * Por definição, se dois objetos são iguais, o seu hashcode deve ser o mesmo.
         * Portanto se você reescrever o método equals, você deve reescrever também o método hashcode.
         */

        @Override
        public int hashCode () {
            return value;
        }

        @Override
        public String toString () { // Ou ainda, reescrever o método toString, para devolver uma String de todos os campos presentes
            return "Value: " + value;
        }

        @Override
        protected void finalize ()
                throws Throwable { // O método finalize é chamada assim que o objeto é destruído pelo garbage colector
            super.finalize();
            System.out.println("I'm dead.");
        }
    }

}
