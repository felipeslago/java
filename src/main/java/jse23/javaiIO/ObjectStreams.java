package jse23.javaiIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectStreams {

    /**
     * Os Object Streams suportam operacoes binarias de I/O para tipos primitivos e objetos
     *
     * Este exemplo demonstra a escrita de um arquivo binario e sua leitura, portanto confira o arquivo gerado apos a
     * execucao do programa
     *
     * Ao tentar fazer o cast da leitura de um objeto, caso a classe desse objeto esteja errada, sera lancada uma
     * ClassNotFoundException
     */

    public static void main(String[] args) throws IOException {

        String dataFile = "src/main/resources/remove.txt";

        Double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
        Integer[] units = { 12, 8, 13, 29, 50 };
        String[] descs = { "Camiseta", "Bone", "Shorts", "Meia", "Pulseira" };
        Calendar[] invoices = { new GregorianCalendar(2000, 0, 1),
                new GregorianCalendar(2000, 1, 1),
                new GregorianCalendar(2000, 2, 1),
                new GregorianCalendar(2000, 3, 1),
                new GregorianCalendar(2000, 4, 1) };

        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));

        for (int i = 0; i < prices.length; i++) {
            out.writeObject(prices[i]);
            out.writeObject(units[i]);
            out.writeObject(descs[i]);
            out.writeObject(invoices[i]);
        }

        out.close();

        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)));

        Double price;
        Integer unit;
        String desc;
        Calendar invoice;

        try {
            while (true) {
                price = (Double) in.readObject();
                unit = (Integer) in.readObject();
                desc = (String) in.readObject();
                invoice = (Calendar) in.readObject();
                System.out.format("Pedido: %d unidades de %s %.2f %tD%n %n", unit, desc, price, invoice);
            }
        } catch (EOFException e) {
            System.out.println("Fim do arquivo");
        } catch (ClassNotFoundException e) {
            System.out.println("Nao foi possivel converter um objeto");
        }

        in.close();
    }

}
