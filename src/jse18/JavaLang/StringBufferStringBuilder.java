package jse18.JavaLang;

public class StringBufferStringBuilder {

	public static void main(String[] args) {
		
		// The classes StringBuilder and StringBuffer are used to manipulate strings
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("text");
		sbf.append(" more text");
		
		System.out.println(sbf);
		
		StringBuilder sbl = new StringBuilder();
		sbl.append("another text");
		sbl.append(" another more text");
		
		System.out.println(sbl);
		
		// The only difference between this class is that StringBuilder is not thread-safe
		
	}
	
}
