package collections;

import java.util.ArrayList;

//Collections (Before Java 1.5) are not type syfed
public class Test {

	public static void main(String[] args) {

		ArrayList names = new ArrayList();
		names.add("Kobi");
		names.add("Yaakov");
		names.add("Moshe");
		names.add(new Integer(45));
		
		String str = (String) names.get(3);//RTE:  java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		
		
	}

}