package jse16_inheritance;

public class ObjectAsSuperClass implements Cloneable {

    int value;

    String text;

    /**
     * Todas as classes, por mais que nao seja visivel, extendem da super classe Object Com isso, alguns metodos dessa
     * super classe ficam disponiveis para uso assim que um objeto e instanciado Abaixo serao exibidos alguns metodos da
     * classe Object que pode ser utilizados
     */

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectAsSuperClass objectAsSuperClass = new ObjectAsSuperClass();
        objectAsSuperClass.value = 10;
        objectAsSuperClass.text = "created";

        /**
         * Se tivermos dois objetos Object o1 = new Object; Object o2 = new Object; E fizermos uma atribuicao usando o
         * sinal de = o2 = o1; Estamos dizendo que o2 esta referenciando o mesmo endereco de memoria que o1 referencia
         * Com isso, tudo o que for alterado em o1, sera alterado em o2 e vice versa, visto que os dois objetos apontam
         * para o mesmo endereco de memoria
         *
         * Porem, algumas vezes queremos criar uma instancia nova a partir de um objeto existente, preservando seus
         * valores O metodo clone possibilita isso
         */

        ObjectAsSuperClass objectAsSuperClassClone = (ObjectAsSuperClass) objectAsSuperClass.clone(); // Note que esse
                                                                                                      // metodo retorna
                                                                                                      // um objeto,
                                                                                                      // portanto e
                                                                                                      // necessario
                                                                                                      // fazer o cast
        System.out.println("Value: " + objectAsSuperClassClone.value);
        System.out.println("Text: " + objectAsSuperClassClone.text);

        /**
         * O metodo equals fornece uma maneira de comparar dois objetos Essa comparacao e feita atraves do operador ==
         * Dessa maneira, apenas objetos do tipo primitivo seriam considerados iguais Se duas instancias diferentes (nao
         * apontando para o mesmo endereco de memoria) forem comparadas, o resultado sempre sera falso
         */

        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println("o1 e igual a o2: " + o1.equals(o2));

        o1 = o2;

        System.out.println("o1 e igual a o2: " + o1.equals(o2));

        /**
         * O metodo hashcode prove o endereco de memoria em que o objeto esta alocado, representado em hexadecimal
         */

        o1 = new Object();

        System.out.println("Endereco de memoria de o1: " + o1.hashCode());
        System.out.println("Endereco de memoria de o2: " + o2.hashCode());

        /**
         * O metodo toString devolve uma String que representa o objeto
         */

        System.out.println("String de o1: " + o1.toString());
        System.out.println("String de o2: " + o2.toString());
    }

    class Overriding {

        int value;

        /**
         * Todos os metodos da super classe Object podem ser reescritos (@override), dando assim o toque de cada
         * programador
         */

        @Override
        public boolean equals(final Object obj) { // Como por exemplo, reescrever o metodo para comparar cada campo de
                                                  // um objeto, ao
                                                  // inves do seu endereco de memoria
            Overriding obj2 = (Overriding) obj;
            return value == obj2.value;
        }

        /**
         * Por definicao, se dois objetos sao iguais, o seu hashcode deve ser o mesmo. Portanto se voce reescrever o
         * metodo equals, voce deve reescrever tambem o metodo hashcode.
         */

        @Override
        public int hashCode() {
            return value;
        }

        @Override
        public String toString() { // Ou ainda, reescrever o metodo toString, para devolver uma String de todos os
                                   // campos presentes
            return "Value: " + value;
        }

        @Override
        protected void finalize() throws Throwable { // O metodo finalize e chamada assim que o objeto e destruido pelo
                                                     // garbage colector
            super.finalize();
            System.out.println("I'm dead.");
        }
    }

}
