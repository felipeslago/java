package jse15_interfaces;

public class UsingDefaultMethods implements DefaultMethods {

    @Override
    public void print(final int value) {
        System.out.println("Valor: " + value);
    }

    public static void main(String[] args) {
        UsingDefaultMethods usingDefaultMethods = new UsingDefaultMethods();

        int sum = DefaultMethods.sum(5, 5); // Usando metodo estatico diretamente da interface
        usingDefaultMethods.print(sum);
        usingDefaultMethods.sumAndPrint(5, 5); // Usando metodo default a partir da instancia
    }

}
