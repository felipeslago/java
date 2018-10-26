package jse29_reflection;

public class ReflectionTest {

    public static void main(String[] args) {

        // Verifique a classe Register para ver o uso de Reflection

        Person person = new Person();
        Register register = new Register();

        register.registerPerson(person);

        register.checkNull(person);

    }

}
