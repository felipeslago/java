package jse01.variables;

public class PrimitiveDataType {

    /**
     * Ao declarar variáveis, primeiramente devemos definir seu tipo e depois seu nome
     * Adicionalmente, pode-se definir o seu valor na declaração, o que é chamado de inicialização
     */

    public static void main (String[] args) {

        /**
         * Ao declarar uma variável e não inicializá-la, ela assume um valor default:
         *
         * Tipo:	Valor Default:
         * ------- ---------------
         * byte	    0
         * short	0
         * int		0
         * long	    0L
         * float	0.0f
         * double	0.0d
         * boolean	false
         * char	    \u0000
         */

        /**
         * O operador = é utilizado para atribuir valores às variáveis
         * */

        byte integer8bits; // Inicializando uma variável
        short integer16bits;
        int integer32bits;
        long integer64bits;
        float floatingPoint32BitsNumber;
        double floatingPoint64BitsNumber;
        boolean bool;
        char character;

        integer8bits = Byte.MIN_VALUE;
        System.out.println("byte min value: " + integer8bits);
        integer8bits = Byte.MAX_VALUE;
        System.out.println("byte max value: " + integer8bits);

        System.out.println("-------------------------------------------");

        integer16bits = Short.MIN_VALUE;
        System.out.println("short min value: " + integer16bits);
        integer16bits = Short.MAX_VALUE;
        System.out.println("short max value: " + integer16bits);

        System.out.println("-------------------------------------------");

        integer32bits = Integer.MIN_VALUE;
        System.out.println("int min value: " + integer32bits);
        integer32bits = Integer.MAX_VALUE;
        System.out.println("int max value: " + integer32bits);

        System.out.println("-------------------------------------------");

        integer64bits = Long.MAX_VALUE;
        System.out.println("long min value: " + integer64bits);
        integer64bits = Long.MIN_VALUE;
        System.out.println("long max value: " + integer64bits);

        System.out.println("-------------------------------------------");

        floatingPoint32BitsNumber = Float.MIN_VALUE;
        System.out.println("float min value: " + floatingPoint32BitsNumber);
        floatingPoint32BitsNumber = Float.MAX_VALUE;
        System.out.println("float max value: " + floatingPoint32BitsNumber);

        System.out.println("-------------------------------------------");

        floatingPoint64BitsNumber = Double.MIN_VALUE;
        System.out.println("double min value: " + floatingPoint64BitsNumber);
        floatingPoint64BitsNumber = Double.MAX_VALUE;
        System.out.println("double max value: " + floatingPoint64BitsNumber);

        System.out.println("-------------------------------------------");

        bool = false;
        System.out.println("boolean false value: " + bool);
        bool = true;
        System.out.println("boolean true value: " + bool);

        System.out.println("-------------------------------------------");

        character = 'A';
        System.out.println("char value: " + character);

    }
}
