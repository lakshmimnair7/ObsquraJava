package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	
	//List is inbuild interface

	public static void main(String[] args) {
		
		List<Integer> obj = new ArrayList<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		System.out.println(obj);
		for (int i:obj)
		{
			System.out.println(i);
		}
		
		Iterator a = obj.iterator(); //iterator referencevariable = objname.iterator();
		while(a.hasNext())
	
		{
			System.out.println(a.next());
			a.remove();
		
		}
		
		
		

	}

}
