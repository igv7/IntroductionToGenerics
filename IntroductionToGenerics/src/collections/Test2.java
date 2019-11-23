package collections;

import java.util.ArrayList;

//Collections - Type safe
public class Test2 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Kobi");
		names.add("Yaakov");
		names.add("Moshe");
//		names.add(new Integer(45));
		
//		String str = (String) names.get(3);//RTE:  java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		
		
	}

}