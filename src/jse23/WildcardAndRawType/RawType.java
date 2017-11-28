package jse23.WildcardAndRawType;

import java.util.ArrayList;
import java.util.List;

public class RawType<T> {

	// Raw Type is the name of a generic class or interface that takes unknown types of arguments
	// It can be defined by any name, but the letters T and E are used by convention
	
	List<T> list = new ArrayList<>();
	
	public void print(T t) {
		System.out.println(t);
	}
	
}
