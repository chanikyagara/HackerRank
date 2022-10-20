

import java.util.HashMap;

public class MakeAnagram {
    public static void main(String[] args) {
        String a = "cdeqw";
        String b = "cdeqw";
        int count = 0;
        HashMap<Character, Integer> hmap = new HashMap<>();
        HashMap<Character, Integer> gmap = new HashMap<>();
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            if (hmap.containsKey(c)){
                hmap.put(c, hmap.get(c) + 1);
            } else {
                hmap.put(c, 1);
            }            
        }
        for (int i=0; i<b.length(); i++){
            char c = b.charAt(i);
            if (gmap.containsKey(c)){
                gmap.put(c, gmap.get(c) + 1);
            } else {
                gmap.put(c, 1);
            }  
        
            // Below condition to get the count common letters in both strings
            if(hmap.containsKey(c) && hmap.get(c) != 0){
                hmap.put(c, hmap.get(c) - 1);
                count += 2;
            }
        }
        //   // Below condition to check Anagram
        //   if(hmap.equals(gmap)){
        //     System.out.println("Anagram");
        // } else {
        //     System.out.println("Not Anagram");
        // }

        // get the number of letters to remove to make both strings Anagram
        System.out.println(a.length()+b.length()-count);

    }
}
