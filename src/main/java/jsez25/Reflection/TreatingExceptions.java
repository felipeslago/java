package jsez25.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TreatingExceptions {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// When working with reflection is common getting some exceptions
		// Below are explanations of the most important ones
		
		try {
			Object obj = new Person();
			Class<?> c = obj.getClass();
			
			// When try getting a field by name, it throws a NoSuchFieldException
			// In order words it says that may not be possible to get a field with this name, so the exception must the treated
			// If an attribute is set to private, this exception can be thrown
			
			Field field = c.getField("fieldName");
			
			// When try getting a method by name and parameters, it throws a NoSuchMethodException
			// In order words it says that may not be possible to get a method with this name and parameters, so the exception must the treated
			// If a method is set to private, this exception can be thrown
			
			Method method = c.getMethod("methodName", c);
			
			// When try invoking a method it throws IllegalArgumentException, IllegalAccessException and InvocationTargetException
			// IllegalArgumentException: the passed parameters are not compatible with the method parameters (could be the parameter type and/or the number of parameters)
			// IllegalAccessException: there is no permission to access the method (maybe the method is set to private)
			// InvocationTargetException: encapsulates the error when the exception was thrown by the method or constructor invoked
			
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
			
			// To get the original exception, the method getTargetException can be used
			
			e.printStackTrace();
		}
		
	}
	
}
