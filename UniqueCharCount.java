

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class UniqueCharCount {
    public static void main(String[] args) {
        String s = "abrrs";
        int totalCount = 0;
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(int i=0; i<s.length(); i++){
           if (charCount.containsKey(s.charAt(i))){
               charCount.put(s.charAt(i), charCount.get(s.charAt(i)) + 1);
           } else {
               charCount.put(s.charAt(i), 1);
               totalCount++;
           }
       }
        System.out.println(totalCount);

        //* Advanced way of counting using concurrent hashmap and LongAdder
        ConcurrentMap<Character, LongAdder> occ = new ConcurrentHashMap<>();
        for (char char1 : s.toCharArray()) {
            occ.computeIfAbsent(char1, ch -> new LongAdder()).increment();
        }
        System.out.println(occ);
    }


}
