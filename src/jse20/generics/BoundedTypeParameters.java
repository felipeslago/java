package jse20.generics;

public class BoundedTypeParameters {

    /**
     * A notação Bounded Type Parameters auxilia na restrição do tipo genérico que será passado na criação da classe
     *
     * No caso da classe abaixo, somente serão aceitos tipos que descendem de Number (Integer, Long, Float e etc.)
     */

    class Numbers<T extends Number> {
        T t;

        void set(T t) {
            this.t = t;
        }

        int getIntValue() {
            return t.intValue();

            /**
             * Como especificamos o "tipo pai", já temos a disposição alguns métodos padrão da classe Number
             */
        }
    }

    /**
     * Os métodos genéricos também podem utilizar da notação Bounded Type Parameters da mesma forma
     *
     * No método abaixo, só serão aceitos tipos que descendem de Comparable
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
         * Se tentarmos criar um objeto Numbers do tipo String, a IDE irá deixar a classe com erro
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
