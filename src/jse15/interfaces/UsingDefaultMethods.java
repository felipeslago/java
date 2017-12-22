package jse15.interfaces;

public class UsingDefaultMethods implements DefaultMethods {

    @Override
    public void print (final int value) {
        System.out.println("Valor: " + value);
    }

    public static void main (String[] args) {
        UsingDefaultMethods usingDefaultMethods = new UsingDefaultMethods();

        int sum = DefaultMethods.sum(5, 5); // Usando m�todo est�tico diretamente da interface
        usingDefaultMethods.print(sum);
        usingDefaultMethods.sumAndPrint(5, 5); // Usando m�todo default a partir da inst�ncia
    }

}
