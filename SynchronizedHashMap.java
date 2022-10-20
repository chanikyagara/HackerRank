// Java program to demonstrate the
// working of Synchronized HashMap

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SynchronizedHashMap {
	public static void main(String args[])
	{

		// Creating a HashMap
		HashMap<Integer, String> hmap
			= new HashMap<Integer, String>();

		// Adding the elements using put method
		hmap.put(10, "Geeks");
		hmap.put(20, "for");
		hmap.put(30, "Geeks");
		hmap.put(25, "Welcome");
		hmap.put(40, "you");

		// Creating a synchronized map
		Map<Integer, String> map = Collections.synchronizedMap(hmap);
		Set<Entry<Integer, String>> set = map.entrySet();

		// Synchronize on HashMap, not on set
		synchronized (map)
		{
			Iterator<Entry<Integer, String>> i = set.iterator();
			// Printing the elements
			while (i.hasNext()) {
				Map.Entry<Integer, String> me = (Map.Entry<Integer, String>)i.next();
				System.out.print(me.getKey() + ": ");
				System.out.println(me.getValue());
			}
		}
	}
}
