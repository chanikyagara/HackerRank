import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
    //number of charecters in a word
    public static void main(String[] args) {
        String str = "ABC ABC ABC";
        ///* Not thread safe 
        Map<Character, LongAdder> occurances = new Hashtable<>();
        for (char character : str.toCharArray()) {
            LongAdder longAdder = occurances.get(character);
            if (longAdder == null) {
                longAdder = new LongAdder();
            }
            longAdder.increment();
            occurances.put(character, longAdder);
        }
        System.out.println(occurances);
         ///* Not thread safe 

         ///* Thread safe 
        ConcurrentMap<Character, LongAdder> occ = new ConcurrentHashMap<>();
        for (char char1 : str.toCharArray()) {
            occ.computeIfAbsent(char1, ch -> new LongAdder()).increment();
        }
        System.out.println(occ);
         ///* Thread safe 
    }
}
