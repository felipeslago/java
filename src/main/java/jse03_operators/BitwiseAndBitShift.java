package jse03_operators;

public class BitwiseAndBitShift {

    public static void main(String[] args) {

        /**
         * A linguagem de progracao Java tambem prove operadores que executam operacoes de bitwise e bit shift Esses
         * operadores sao utilizados para ajudar na manipulacao de bits
         *
         * Operador: Descricao: --------- ----------------- ~ Inverte o bit << Muda o bit para a esquerda >> Muda o bit
         * para a direita >>> Substitui um zero na ultima posicao da esquerda & Operacao AND ^ Operacao OR exclusiva |
         * Operacao OR inclusiva
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
