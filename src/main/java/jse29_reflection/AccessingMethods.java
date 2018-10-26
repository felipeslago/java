package jse29_reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class AccessingMethods {

    public static void listObjectMethods(Object obj) throws Exception {

        Class<?> c = obj.getClass(); // Recupera a classe
        Method[] methods = c.getMethods(); // Recupera apenas os metodos publicos

        System.out.println("Public methods: ");
        System.out.println();

        // Recupera o nome, total de parametros e o tipo de retorno do metodo

        for (Method method : methods) {
            System.out.println(method.getName() + " - " + method.getParameterCount() + " - " + method.getReturnType());
        }

        // Recupera os metodos publicos e privados, menos os metodos da superclasse

        methods = c.getDeclaredMethods();

        System.out.println();
        System.out.println("Public and Private methods: ");
        System.out.println();

        for (Method method : methods) {

            // Se um metodo eh privado, nao eh possivel acessa-lo sem antes altera-lo para enable
            // Atraves do uso de reflection eh possivel fazer isso
            // Mas dependendo onde estiver rodando, o SecurityManager pode bloquear essa acao

            if (!method.isAccessible()) { // Check if the method is private
                method.setAccessible(true); // Turn method to public
            }

            System.out.println(method.getName() + " - " + method.getParameterCount() + " - " + method.getReturnType());
        }

        // Invocando metodos

        for (Method method : methods) {

            if (!method.isAccessible()) {
                method.setAccessible(true);
            }

            Parameter[] parameters = method.getParameters(); // Recupera os parametros do metodo
            Object[] objs = new Object[parameters.length];

            // Checar cada parametro e criar um tipo para ele

            for (int i = 0; i < parameters.length; i++) {

                // Para dados do tipo primitivo nao eh possivel criar uma instancia de tipo primitivo

                switch (parameters[i].getType().toString()) {
                case "byte":
                    objs[i] = new Byte(null);
                    break;
                case "short":
                    objs[i] = new Short(null);
                    break;
                case "int":
                    objs[i] = new Integer(0);
                    break;
                case "long":
                    objs[i] = new Long(null);
                    break;
                case "float":
                    objs[i] = new Float(null);
                    break;
                case "double":
                    objs[i] = new Double(null);
                    break;
                case "char":
                    objs[i] = new Character(' ');
                    break;
                case "boolean":
                    objs[i] = new Boolean(null);
                    break;
                default:
                    objs[i] = parameters[i].getType().newInstance();
                    break;
                }
            }

            if (parameters.length == 0) { // Verifica se o construtor tem parametros
                System.out.println(method.invoke(obj)); // Invoca o metodo com os parametros
            } else {
                System.out.println(method.invoke(obj, objs)); // Invoca o metodo sem os parametros
            }
        }

    }

    public static void main(String[] args) throws Exception {

        Person person = new Person("John", "Fox", 20, "Main Street", "ABC321");

        AccessingMethods.listObjectMethods(person);

    }

}
