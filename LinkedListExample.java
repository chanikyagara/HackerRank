
import java.util.*;
public class LinkedListExample {

	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<>();

		ll.add("Geeks");
		ll.add("Geeks");
		System.out.println(ll);
		ll.add(1, "For");
		
		System.out.println(ll.stream().filter(i -> i=="Geeks").count());
		ll.add(1, "For2");
		System.out.println(ll);
		ll.set(1, "For");
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		ll.remove("Geeks"); // first occurance will be removed.
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }   
        System.out.println();
        // Using the for each loop
        for (String str : ll){
			System.out.print(str + " ");
		}
	}
}


