
import java.util.ArrayList;
import java.util.List;

public class ListOfStrings {
    public static void main(String[] args) {
        // Creating an object of List interface, 
        // implemented by ArrayList class
        List<String> al = new ArrayList<>();

  
        // Adding elements to object of List interface
        // Custom elements
        al.add("Gara");
        al.add("Gara");
        System.out.println(al);
        al.add(1, "For");
  
        // Print all the elements inside the
        // List interface object
        System.out.println(al);
        //remove the first occurrence
        al.remove("Gara");
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
        //Updating the list
        al.set(0,"Gara");
        System.out.println(al);
        List<String> al2 = new ArrayList<>();
        al2.add("Chan");
        al2.add("Anitha");
        al2.add("Dharyush");
        al2.add("Chaarvi.");
        //Add all the elements in the given collection to the list
        al.addAll(al2);
        // Returns index of element
        System.out.println(al2.indexOf("Chaarvi."));
         // Returns index of last element
        System.out.println(al2.lastIndexOf("Chaarvi."));
        // Return -1 if not found
        System.out.println(al2.indexOf("Chaarvi"));

        System.out.println(al2.containsAll(al));
        al2.clear();
        System.out.printf("al2: \n", al2);

        //for loop
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        //for each loop
        for (String name : al) {
            System.out.println(name);
            
        }

        
     }
    
}
