package jse05.classes;

public class UsingMethods {

    public static void main(String[] args) {
        OverloadingMethods overloadingMethods = new OverloadingMethods();

        overloadingMethods.print("Apenas um texto");
        overloadingMethods.print("Texto 1", "Texto 2");
        overloadingMethods.print(10);

        System.out.println("-----------------------------------");

        ArbitraryNumberOfArguments arbitraryNumberOfArguments = new ArbitraryNumberOfArguments();

        arbitraryNumberOfArguments.print("Texto 1", "Texto 2", "Texto 3", "Texto N");
        arbitraryNumberOfArguments.print(10, 20, 30, 40, 50);

        System.out.println("-----------------------------------");

        PassingArguments passingArguments = new PassingArguments();

        int num = 10;
        AccountClass accountClass = new AccountClass();
        accountClass.number = 1234;

        passingArguments.modify(num);
        passingArguments.modify(accountClass);

        System.out.println("Numero original: " + num);
        System.out.println("Conta original: " + accountClass.number);
    }

}
