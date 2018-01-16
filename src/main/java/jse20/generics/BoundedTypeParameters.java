package jse20.generics;

public class BoundedTypeParameters {

    /**
     * A notacao Bounded Type Parameters auxilia na restricao do tipo generico que sera passado na criacao da classe
     *
     * No caso da classe abaixo, somente serao aceitos tipos que descendem de Number (Integer, Long, Float e etc.)
     */

    class Numbers<T extends Number> {
        T t;

        void set(T t) {
            this.t = t;
        }

        int getIntValue() {
            return t.intValue();

            /**
             * Como especificamos o "tipo pai", ja temos a disposicao alguns metodos padrao da classe Number
             */
        }
    }

    /**
     * Os metodos genericos tambem podem utilizar da notacao Bounded Type Parameters da mesma forma
     *
     * No metodo abaixo, so serao aceitos tipos que descendem de Comparable
     */

    public <T extends Comparable<T>> int compare(T element1, T element2) {
        return element1.compareTo(element2);
    }

    public void execute() {
        Numbers<Double> doubleNumbers = new Numbers<>();
        doubleNumbers.set(10.2);

        Numbers<Float> longNumbers = new Numbers<>();
        longNumbers.set(10.4f);

        System.out.println(doubleNumbers.getIntValue());
        System.out.println(longNumbers.getIntValue());

        /**
         * Se tentarmos criar um objeto Numbers do tipo String, a IDE ira deixar a classe com erro
         *
         * Ex.: Numbers<String> stringNumbers = new Numbers<String>();
         */

        String text1 = "Hello";
        String text2 = "World";

        int result = compare(text1, text2);

        System.out.println(result);
    }

    public static void main(String[] args) {
        BoundedTypeParameters boundedTypeParameters = new BoundedTypeParameters();
        boundedTypeParameters.execute();
    }

}
