package z.z28_DesignPatterns_ChainOfResponsibility;

public class UsingChainOfResponsibility {

    // The Chain of Responsibility Pattern is used to set a a list of sequential activities in a non procedural
    // structure
    // It shares the responsibility with other classes

    // In this example the intention is to calculate a discount based on the number of bought items
    // If a receipt has at least 5 items it will have 20% off discount
    // If has at least 10 items it will have 30% off discount
    // And if has at least 20 items it will have 50% off discount

    // To correctly apply the discount the code must follow the order above
    // But putting all this conditions together in a procedural code is not a good practice
    // The alternative is to create an Interface that implements a kind of a linked list
    // So a discount will know the next discount and so on (DiscountCalculator class)

    public static void main(String[] args) {

        Receipt receipt1 = new Receipt(2000.0, 5);
        Receipt receipt2 = new Receipt(5000.0, 10);
        Receipt receipt3 = new Receipt(10000.0, 20);

        DiscountCalculator dc = new DiscountCalculator();
        double discount = 0.0;

        discount = dc.calculate(receipt1);
        System.out.println(discount);

        discount = dc.calculate(receipt2);
        System.out.println(discount);

        discount = dc.calculate(receipt3);
        System.out.println(discount);
    }

}
