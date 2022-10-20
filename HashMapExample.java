
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String> gfg = new HashMap<String,String>();
      
        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");
          
        //*** */ using for-each loop for iteration over Map.entrySet()
        for (HashMap.Entry<String,String> entry : gfg.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());


        HashMap<String,String> gfg1 = new HashMap<String,String>();
      
        // enter name/url pair
        gfg1.put("GFG", "geeksforgeeks.org");
        gfg1.put("Practice", "practice.geeksforgeeks.org");
        gfg1.put("Code", "code.geeksforgeeks.org");
        gfg1.put("Quiz", "quiz.geeksforgeeks.org");
          
        // using keySet() for iteration over keys
        for (String name : gfg1.keySet()) 
            System.out.println("key: " + name);
          
        // using values() for iteration over values
        for (String url : gfg1.values()) 
            System.out.println("value: " + url);

        HashMap<String,String> gfg2 = new HashMap<String,String>();
    
        // enter name/url pair
        gfg2.put("GFG", "geeksforgeeks.org");
        gfg2.put("Practice", "practice.geeksforgeeks.org");
        gfg2.put("Code", "code.geeksforgeeks.org");
        gfg2.put("Quiz", "quiz.geeksforgeeks.org");
            
        // forEach(action) method to iterate map
        gfg2.forEach((k,v) -> 
        System.out.println("Key = "+ k + ", Value = " + v));
    
    }
}
