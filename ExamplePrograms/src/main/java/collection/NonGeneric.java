package collection;

import java.util.ArrayList;

public class NonGeneric {

	public static void main(String[] args) {
		
		ArrayList obj = new ArrayList(); // Arraylist stored in index based
		obj.add(100);
		obj.add("HelloWorld"); 
		obj.add(150.2);
		System.out.println(obj);
		
		
		int a = obj.size(); // Finding ArrayList Size
		System.out.println("Size is :" +a);
		
		// obj.get(a); 
		System.out.println(obj.get(2)); // getting a value from specified index
		
		System.out.println(obj.remove(1)); // removing an element from an index
		System.out.println(obj);
		
		//boolean b = obj.contains(100);// checks a value is available or not
		boolean b = obj.contains(250);
		System.out.println(b);   //Print as true or false
		
		
		ArrayList obj1=new ArrayList();
		obj1.add(10);
		obj1.add("Non Generic Example");
		obj1.add(2);
		obj1.addAll(obj);
		System.out.println(obj1);
		obj1.removeAll(obj1);
		System.out.println(obj1);	

	}

}
