
// Java Program to demonstrate the
// working of ConcurrentHashMap

import java.util.*;
import java.util.concurrent.*;

public class IteratorConcurrentHashMap {

	public static void main(String[] args)
	{

		// create an instance of ConcurrentHashMap
		ConcurrentHashMap<Integer, String> chmap
			= new ConcurrentHashMap<Integer, String>();

		// Add elements using put()
		chmap.put(10, "Geeks");
		chmap.put(20, "for");
		chmap.put(30, "Geeks");
		chmap.put(40, "Welcome");
		chmap.put(50, "you");

		// Create an Iterator over the
		// ConcurrentHashMap
		Iterator<ConcurrentHashMap.Entry<Integer, String> >
			itr = chmap.entrySet().iterator();

		// The hasNext() method is used to check if there is
		// a next element and the next() method is used to
		// retrieve the next element
		while (itr.hasNext()) {
			ConcurrentHashMap.Entry<Integer, String> entry
				= itr.next();
			System.out.println("Key = " + entry.getKey()
							+ ", Value = "
							+ entry.getValue());
		}
	}
}
