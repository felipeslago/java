package jse13_enum_types;

public class UsingEnum {

    public static void main(String[] args) {

        /**
         * Um Enum nao precisa ser instanciado E cada constante pode ser acessada diretamente, como se fosse uma
         * variavel estatica
         */

        DayTest dayTest = new DayTest(Day.MONDAY);
        dayTest.todayIs();

        System.out.println("All days:");

        /**
         * O acesso as propriedades da constante Enum e feito atraves dos getters
         */

        for (Day day : Day.values()) {
            System.out.println("Day: " + day.getDayName() + ", Day of week: " + day.getDayOfWeek());
        }
    }

}
