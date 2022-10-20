

import java.util.HashMap;

public class UniqueMaxSubstring {
    public static void main(String[] args) {
        String s = "abcabcdefg";
         // Creating a set to store the last positions of occurrence
    HashMap<Character, Integer> seen = new HashMap<>(); 
    int maximum_length = 0;
    String max_string = "";
 
    // starting the initial point of window to index 0
    int start = 0;
 
    for(int end = 0; end < s.length(); end++) {
      // Checking if we have already seen the element or not
      if(seen.containsKey(s.charAt(end)))
      {
        // If we have seen the number, move the start pointer
        // to position after the last occurrence
        System.out.println("end " + end + " s.char " + s.charAt(end));
        start = Math.max(start, seen.get(s.charAt(end)) + 1);
      }
 
      // Updating the last seen value of the character
      seen.put(s.charAt(end), end);
    //   maximum_length = Math.max(maximum_length, end-start + 1);
      if(maximum_length < end-start+1){
          maximum_length = end-start+1;
          max_string = s.substring(start, end+1);
      }
    }
     System.out.println(maximum_length);
     System.out.println(max_string);
    }
}
