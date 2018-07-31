package z.z25_Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class AccessingMethods {

    // Accessing methods looks like accessing attributes

    public static void listObjectMethods(Object obj) throws Exception {

        Class<?> c = obj.getClass(); // Gets the class
        Method[] methods = c.getMethods(); // Gets only the PUBLIC methods

        System.out.println("Public methods: ");
        System.out.println();

        for (Method method : methods) {
            System.out.println(method.getName() + " - " + method.getParameterCount() + " - " + method.getReturnType()); // Gets
                                                                                                                        // the
                                                                                                                        // method
                                                                                                                        // name,
                                                                                                                        // total
                                                                                                                        // of
                                                                                                                        // parameters
                                                                                                                        // and
                                                                                                                        // the
                                                                                                                        // return
                                                                                                                        // type
        }

        methods = c.getDeclaredMethods(); // Gets PUBLIC and PRIVATE methods, but not gets the methods from the
                                          // superclass

        System.out.println();
        System.out.println("Public and Private methods: ");
        System.out.println();

        for (Method method : methods) {

            // If some method is PRIVATE is not possible to access it before making it enabled
            // It is possible to turn some methods into public, but only in reflection code
            // But depending on what it is running, the SecurityManager can block it

            if (!method.isAccessible()) { // Check if the method is private
                method.setAccessible(true); // Turn method to public
            }

            System.out.println(method.getName() + " - " + method.getParameterCount() + " - " + method.getReturnType());
        }

        // Invoking methods

        for (Method method : methods) {

            if (!method.isAccessible()) {
                method.setAccessible(true);
            }

            Parameter[] parameters = method.getParameters(); // Gets method parameters
            Object[] objs = new Object[parameters.length]; // Creates an object array with the size of the total of
                                                           // parameters to store them

            // Then check every parameter and creates a new instance for them

            for (int i = 0; i < parameters.length; i++) {
                switch (parameters[i].getType().toString()) { // In case of primitive data type, it is not possible to
                                                              // create a new instance from it primitive type
                case "byte":
                    objs[i] = new Byte(null); // Creates a new object from the corresponding object wrapper class
                    break;
                case "short":
                    objs[i] = new Short(null); // Creates a new object from the corresponding object wrapper class
                    break;
                case "int":
                    objs[i] = new Integer(0); // Creates a new object from the corresponding object wrapper class
                    break;
                case "long":
                    objs[i] = new Long(null); // Creates a new object from the corresponding object wrapper class
                    break;
                case "float":
                    objs[i] = new Float(null); // Creates a new object from the corresponding object wrapper class
                    break;
                case "double":
                    objs[i] = new Double(null); // Creates a new object from the corresponding object wrapper class
                    break;
                case "char":
                    objs[i] = new Character(' '); // Creates a new object from the corresponding object wrapper class
                    break;
                case "boolean":
                    objs[i] = new Boolean(null); // Creates a new object from the corresponding object wrapper class
                    break;
                default:
                    objs[i] = parameters[i].getType().newInstance(); // Gets the parameter type and creates a new
                                                                     // instance of it
                    break;
                }
            }

            if (parameters.length == 0) { // Checks if the constructor has parameters
                System.out.println(method.invoke(obj)); // Invokes the method with no parameter
            } else {
                System.out.println(method.invoke(obj, objs)); // Invokes the method with the parameters
            }
        }

    }

    public static void main(String[] args) throws Exception {

        Person person = new Person("John", "Fox", 20, "Main Street", "ABC321");

        AccessingMethods.listObjectMethods(person);

    }

}
