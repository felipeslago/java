package jse23.javaiIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreams {

    /**
     * As Data Streams suportam operacoes binarias de I/O para tipos primitivos, assim como para strings
     *
     * Este exemplo demonstra a escrita de um arquivo binario e sua leitura, portanto confira o arquivo gerado apos a
     * execucao do programa
     */

    public static void main(String[] args) throws IOException {

        String dataFile = "src/main/resources/remove.txt";

        double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
        int[] units = { 12, 8, 13, 29, 50 };
        String[] descs = { "Camiseta", "Bone", "Shorts", "Meia", "Pulseira" };

        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));

        for (int i = 0; i < prices.length; i++) {
            out.writeDouble(prices[i]);
            out.writeInt(units[i]);
            out.writeUTF(descs[i]);
        }

        out.close();

        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));

        double price;
        int unit;
        String desc;

        try {
            while (true) {
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();
                System.out.format("Pedido: %d unidades de %s %.2f %n", unit, desc, price);
            }
        } catch (EOFException e) {
            System.out.println("Fim do arquivo");
        }

        in.close();
    }

}
