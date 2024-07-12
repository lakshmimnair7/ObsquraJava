package collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> obj = new ArrayList<Integer>(); // Arraylist stored in index based
		obj.add(100);
		obj.add(50);
		obj.add(20);
		obj.add(5);
		obj.add(2);
		obj.add(20);
		System.out.println(obj);
		int a = obj.size(); // Finding ArrayList Size
		System.out.println("Size is :" + a);
		obj.get(a);
		System.out.println(obj.get(5)); // getting a value from specified index
		System.out.println(obj.remove(4)); // removing an element from an index
		System.out.println(obj);
		boolean b = obj.contains(2); // checks a value is available or not
		System.out.println(b);

		ArrayList<Integer> obj1 = new ArrayList<Integer>();
		obj1.add(100);
		obj1.add(20);
		obj1.add(300);
		obj1.addAll(obj); // Appending multiple ArrayList in a specified collection
		System.out.println(obj1);
		obj1.removeAll(obj1); // removing all the values in array
		System.out.println(obj1);

	}
}