package jse03.operators;

public class BitwiseAndBitShift {

    public static void main (String[] args) {

        /**
         * A linguagem de progra��o Java tamb�m prov� operadores que executam opera��es de bitwise e bit shift
         * Esses operadores s�o utilizados para ajudar na manipula��o de bits
         *
         * Operador:  Descri��o:
         * --------- -----------------
         * ~	      Inverte o bit
         * <<		  Muda o bit para a esquerda
         * >>		  Muda o bit para a direita
         * >>>		  Substitui um zero na �ltima posi��o da esquerda
         * &	      Opera��o AND
         * ^		  Opera��o OR exclusiva
         * |          Opera��o OR inclusiva
         */

        int bit = 0x0000;

        System.out.println(bit);

        bit = ~bit;

        System.out.println(bit);

        bit = bit << 0x0001;

        System.out.println(bit);

        bit = bit >> 0x0001;

        System.out.println(bit);

        bit = bit >>> 0x0001;

        System.out.println(bit);

        bit = bit & 0x0001;

        System.out.println(bit);

        bit = bit ^ 0x0001;

        System.out.println(bit);

        bit = bit | 0x0001;

        System.out.println(bit);

    }

}
