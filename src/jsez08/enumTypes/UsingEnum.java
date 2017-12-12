package jsez08.enumTypes;

public class UsingEnum {

	public static void main(String[] args) {

        /**
         * Um Enum não precisa ser instanciado
         * E cada constante dentro ser acessada diretamente, como se fosse uma variável estática
         */

		DayTest dayTest = new DayTest(Day.MONDAY);
		dayTest.todayIs();
		
		System.out.println("All days:");

        /**
         * O acesso às propriedades da constante Enum é feito através dos getters
         */

		for (Day day : Day.values()) {
			System.out.println("Day: " + day.getDayName() + ", Day of week: " + day.getDayOfWeek());
		}
	}
	
}
