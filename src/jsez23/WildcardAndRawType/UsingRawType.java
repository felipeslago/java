package jsez23.WildcardAndRawType;

import java.util.ArrayList;
import java.util.List;

public class UsingRawType {

	public static void main(String[] args) {
		
		// Once the type T is defined it cannot be changed and do not accept any different type
		
		RawType<String> r1 = new RawType<>();
		List<String> list1 = new ArrayList<>();
		
		RawType<Integer> r2 = new RawType<>();
		List<Integer> list2 = new ArrayList<>();
		
		r1.list = list1; // r1 is String type, so its property will only accept String type objects
		r2.list = list2; // r2 is Integer type, so its property will only accept Integer type objects
		
		r1.print("Text"); // r1 is String type, so its method will only accept String type objects
		r2.print(10); // r2 is Integer type, so its method will only accept Integer type objects
	}
	
}
