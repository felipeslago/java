package jse29_reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TreatingExceptions {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // O uso de reflection deve levar em conta o tratamento de exceptions tambem

        try {
            Object obj = new Person();
            Class<?> c = obj.getClass();

            /**
             * Ao tentar recuperar um atributo, eh possivel que este seja privado, entao a JVM podera lancar uma
             * NoSuchFieldException
             *
             * Essa exception tambem ocorrer caso o nome passado no metodo nao seja encontrado como um atributo
             */

            Field field = c.getField("fieldName");

            /**
             * Ao tentar recuperar um metodo, eh possivel que este seja privado, entao a JVM podera lancar uma
             * NoSuchMethodException
             *
             * Essa exception tambem ocorrer caso o nome e os parametros passados no metodo nao sejam encontrados
             */

            Method method = c.getMethod("methodName", c);

            /**
             * Ao tentar invocar um metodo, podemos receber IllegalArgumentException, IllegalAccessException e
             * InvocationTargetException
             *
             * IllegalArgumentException: pode ser que os parametros passados nao sao compativeis (tipo ou quantidade)
             *
             * IllegalAccessException: pode ser que nao tenha permissao para acessar o metoodo (metodo privado)
             *
             * InvocationTargetException: encapsula o erro quando a excessao eh lancada pelo metodo ou construtor
             * invocado
             */

            method.invoke("parameterValue");

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // Recuperar a excessao original
            e.getTargetException();
        }

    }

}
