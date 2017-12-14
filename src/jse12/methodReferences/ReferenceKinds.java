package jse12.methodReferences;

public class ReferenceKinds {

    interface Calc {

        int execute (int a, int b);
    }

    class CustomCalc {

        public int calculate (int a, int b, Calc operation) {
            return operation.execute(a, b);
        }
    }

    static Integer addition (final int a, final int b) {
        return a + b;
    }

    Integer subtraction (final int a, final int b) {
        return a - b;
    }

    public static void main (String[] args) {
        ReferenceKinds referenceKinds = new ReferenceKinds();
        ReferenceKinds.CustomCalc customCalc = referenceKinds.new CustomCalc();

        customCalc.calculate(1, 1, ReferenceKinds::addition);
        customCalc.calculate(2, 1, referenceKinds::subtraction);
    }

}
