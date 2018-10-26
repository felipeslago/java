package jse29_reflection;

import java.lang.reflect.Field;

public class AccessingAttributes {

    public static void listObjectAttributes(Object obj) throws Exception {

        Class<?> c = obj.getClass(); // Recupera a classe
        Field[] fields = c.getFields(); // Recupera apenas atributos publicos

        System.out.println("Public attributes: ");
        System.out.println();

        for (Field field : fields) {
            // Recupera o tipo, nome e valor do atributo
            System.out.println(field.getType() + " - " + field.getName() + " - " + field.get(obj));
        }

        // Recupera atributos publicos e privados, mas nao os atributos da superclasse
        fields = c.getDeclaredFields();

        System.out.println();
        System.out.println("Public and Private attributes: ");
        System.out.println();

        for (Field field : fields) {

            // Se um atributo eh privado, nao eh possivel acessa-lo sem antes altera-lo para enable
            // Atraves do uso de reflection eh possivel fazer isso
            // Mas dependendo onde estiver rodando, o SecurityManager pode bloquear essa acao

            if (!field.isAccessible()) { // Checa se o atributo eh privado
                field.setAccessible(true); // Transforma o atributo em publico
            }

            System.out.println(field.getType() + " - " + field.getName() + " - " + field.get(obj));
        }

        System.out.println();
        System.out.println("Changing attributes values: ");
        System.out.println();

        for (Field field : fields) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }

            // Eh possivel alterar o valor de um atributo, porem se o atributo for um Integer, por exemplo, e
            // atribuirmos uma String, sera lancada uma exncessao

            if (field.getType() == String.class) { // Safe-check do tipo do atributo
                field.set(obj, "changed"); // Mudando seu valor
            } else if (field.getType() == int.class) {
                field.set(obj, 0);
            }

            System.out.println(field.getType() + " - " + field.getName() + " - " + field.get(obj));
        }

    }

    public static void main(String[] args) throws Exception {

        Person person = new Person("John", "Fox", 20, "Main Street", "ABC321");

        AccessingAttributes.listObjectAttributes(person);

    }

}
