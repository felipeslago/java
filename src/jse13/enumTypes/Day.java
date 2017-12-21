package jse13.enumTypes;

public enum Day {// A palavra enum define um tipo enum

	/**
	 * Um tipo Enum é um tipo de dado especial que possibilita uma variável ter constantes predefinidas
     * Por serem constantes, os nomes dos tipos de enum são definidos em letras maiúsculas (boa prática)
     */

    /**
     * Uma constante de Enum pode ter mais informações dentro dela, através da crianção de variáveis
     * Essas informações devem ser passadas junto com o nome da constante e a classe deverá ter um construtor para recebe-las
     */

	SUNDAY("sunday", 1), // Como se estivesse criando 'new Day("sunday", 1)'
    MONDAY("monday", 2),
    TUESDAY("tuesday", 3),
    WEDNESDAY("wednesday", 4),
	THURSDAY("thursday", 5),
    FRIDAY("friday", 6),
    SATURDAY("saturday", 7);

    String dayName;
    int dayOfWeek;

    Day(String dayName, int dayOfWeek) {
        this.dayName = dayName;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDayName() {
        return dayName;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }
}
