package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Sample {

	public static void main(String[] args) {
			
			     // Creating a LinkedList
			        LinkedList<String> obj = new LinkedList<String>();
			        obj.add("a");
			        obj.add("e");
			        obj.add("i");			// Adding elements to the LinkedList using add() method
			        obj.add("o");
			        obj.add("u");
			        System.out.println(obj);		// Print the LinkedList
			        
			        int size=obj.size();
					System.out.println("Size:"+size);
			        for (String i:obj)
					{
						System.out.println(i);
					}
					
					Iterator a = obj.iterator(); //iterator referencevariable = objname.iterator();
					
					while(a.hasNext())
				
					{
						// System.out.println(a.next());
						a.remove();
					
					}
	}
}


