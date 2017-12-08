package jse03.operators;

public class BitwiseAndBitShift {

    public static void main (String[] args) {

        /**
         * A linguagem de progração Java também provê operadores que executam operações de bitwise e bit shift
         * Esses operadores são utilizados para ajudar na manipulação de bits
         *
         * Operador:  Descrição:
         * --------- -----------------
         * ~	      Inverte o bit
         * <<		  Muda o bit para a esquerda
         * >>		  Muda o bit para a direita
         * >>>		  Substitui um zero na última posição da esquerda
         * &	      Operação AND
         * ^		  Operação OR exclusiva
         * |          Operação OR inclusiva
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
