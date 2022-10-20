
import java.util.HashMap;

public class Pangrams {
    public static void main(String[] args) {
        System.out.println(pangrams("we are about to make an history"));
    }
    public static String pangrams(String s) {
        // A string that contains every letter of the alphabet is called Pangram
        String result = "pangram";
        s = s.toLowerCase();
        HashMap<Integer, Integer> charsMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(charsMap.containsKey((int)s.charAt(i))){
                charsMap.put((int)s.charAt(i), charsMap.get((int)s.charAt(i))+1);
            } else {
                charsMap.put((int)s.charAt(i), 1);
            }        
        }
        // System.out.printf("charsMap: "+charsMap);
        for (int i = 97; i <= 122; i++) {
            // System.out.printf("!charsMap.containsKey(i): "+ !charsMap.containsKey(i));
            if (!charsMap.containsKey(i)) {
                result = "not pangram";
            }
        }
        return result;
        
        }
    
    }

