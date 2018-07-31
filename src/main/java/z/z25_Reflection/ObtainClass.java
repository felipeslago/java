package z.z25_Reflection;

public class ObtainClass {

    public static void main(String[] args) throws Exception {

        // Ways to obtain the class

        Person person = new Person();

        Class<?> c1 = String.class;
        Class<?> c2 = person.getClass();
        Class<?> c3 = Class.forName("java.lang.String");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // There is a method that checks if a class is implemented by another

        Class<?> map = Class.forName("java.util.Map");
        Class<?> hashMap = Class.forName("java.util.HashMap");
        Class<?> hashSet = Class.forName("java.util.HashSet");

        System.out.println(map.isAssignableFrom(hashMap)); // HashMap implements Map interface
        System.out.println(map.isAssignableFrom(hashSet)); // HashSet do not implements Map interface

    }

}
