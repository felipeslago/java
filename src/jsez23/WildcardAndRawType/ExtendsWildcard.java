package jsez23.WildcardAndRawType;

import java.util.ArrayList;
import java.util.List;

public class ExtendsWildcard {

	// Unlike of Unknown WildCard, the Extends WildCard specifies a knowing type
	// So it is possible to call methods and properties that derive from superclass
	
	public static void print(List<? extends Shape> list) {
		
		for(Shape shape : list) {
			System.out.println(shape.name);
		}
		
	}
	
	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle("Circle"));
		shapes.add(new Square("Square"));
		
		ExtendsWildcard.print(shapes);
		
	}
	
}
