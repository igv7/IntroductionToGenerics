package array;

//Array is type-safe
public class Test {
	public static void main(String[] args) {
		
		String [] names = new String[10];
		
		names[0]="Kobi";
		names[1]="Yaakov";
		names[2]="Moshe";
		//names[3]=new Integer(45);//CE: Type mismatch: cannot convert from Integer to String
	}
}