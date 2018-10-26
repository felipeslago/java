package jse29_reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Register {

    /**
     * O uso de reflection pode facilitar alguns casos como abaixo, em que temos uma classe, que com o tempo pode ter
     * mais ou menos atributos e para evitar de ficarmos adicionando/removendo validacoes para cada atributo, podemos
     * faze-lo via reflecion
     */

    List<Person> registered = new ArrayList<>();

    public void registerPerson(Person person) {
        if (person.firstName == null) {
            System.out.println("First Name cannot be null.");
        }
        if (person.lastName == null) {
            System.out.println("Last Name cannot be null.");
        }
        if (person.age == 0) {
            System.out.println("Age cannot be null.");
        }
        if (person.address == null) {
            System.out.println("Address cannot be null.");
        }
        if (person.passport == null) {
            System.out.println("Passport cannot be null.");
        }
    }

    public void checkNull(Object obj) {
        try {
            Class<?> c = obj.getClass();
            Field[] fields = c.getFields();

            for (Field field : fields) {
                Object value = field.get(obj);

                if (value == null) {
                    System.out.println("The property " + field.getName() + " cannot be null");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
