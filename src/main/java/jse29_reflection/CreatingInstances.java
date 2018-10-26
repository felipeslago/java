package jse29_reflection;

import java.lang.reflect.Constructor;

public class CreatingInstances {

    // Eh possivel instanciar um objeto usando seu construtor

    public static Object getInstance(Object obj, Object... params) throws Exception {

        Class<?> c = obj.getClass(); // Recupera a classe
        Class<?>[] types = new Class<?>[params.length]; // Cria um array de parametros

        for (int i = 0; i < params.length; i++) {
            types[i] = params[i].getClass(); // Define o tipo do parametro
        }

        Constructor<?> constructor = c.getConstructor(types); // Recupera o construtor baseado nos parametros
        return constructor.newInstance(params);

    }

    public static void main(String[] args) throws Exception {

        Person person = new Person();

        person = (Person) CreatingInstances.getInstance(person, "John", "Fox", 20, "Main Street", "ABC321");

        System.out.println(person);

    }

}
