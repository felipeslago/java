package jse20.generics;

public class BoundedTypeParameters {

    /**
     * A nota��o Bounded Type Parameters auxilia na restri��o do tipo gen�rico que ser� passado na cria��o da classe
     *
     * No caso da classe abaixo, somente ser�o aceitos tipos que descendem de Number (Integer, Long, Float e etc.)
     */

    class Numbers<T extends Number> {
        T t;

        void set(T t) {
            this.t = t;
        }

        int getIntValue() {
            return t.intValue();

            /**
             * Como especificamos o "tipo pai", j� temos a disposi��o alguns m�todos padr�o da classe Number
             */
        }
    }

    /**
     * Os m�todos gen�ricos tamb�m podem utilizar da nota��o Bounded Type Parameters da mesma forma
     *
     * No m�todo abaixo, s� ser�o aceitos tipos que descendem de Comparable
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
         * Se tentarmos criar um objeto Numbers do tipo String, a IDE ir� deixar a classe com erro
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
