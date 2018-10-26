package jse29_reflection;

public class ObtainClass {

    public static void main(String[] args) throws Exception {

        // Maneira de obter a classe

        Person person = new Person();

        Class<?> c1 = String.class;
        Class<?> c2 = person.getClass();
        Class<?> c3 = Class.forName("java.lang.String");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Class<?> map = Class.forName("java.util.Map");
        Class<?> hashMap = Class.forName("java.util.HashMap");
        Class<?> hashSet = Class.forName("java.util.HashSet");

        // O metodo isAssignableFrom verifica se a classe eh a mesma, uma superclasse ou uma superinterface

        System.out.println(map.isAssignableFrom(hashMap)); // HashMap implementa Map interface
        System.out.println(map.isAssignableFrom(hashSet)); // HashSet nao implementa Map interface

    }

}
