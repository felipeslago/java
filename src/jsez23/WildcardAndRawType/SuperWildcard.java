package jsez23.WildcardAndRawType;

import java.util.ArrayList;
import java.util.List;

public class SuperWildcard {

	// Finally the Super WildCard allows to work with type and what derives from it
	
	public static void add(List<? super Shape> list) {
		list.add(new Circle("Circle"));
		list.add(new Square("Square"));
	}
	
	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<>();
		SuperWildcard.add(shapes);
		
	}
	
}
