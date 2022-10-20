
public class FunnyString {
    // /To determine whether a string is funny, create a copy of the string in reverse 
    // e.g. . Iterating through each string, compare the absolute difference in the ascii values of the characters 
    // at positions 0 and 1, 1 and 2 and so on to the end. 
    // If the list of absolute differences is the same for both strings, they are funny.
    public static void main(String[] args) {
        System.out.println(funnyString("acxz"));
    }
    public static String funnyString(String s) {
        // Write your code here
        String funnyReturn = "Funny";
        int strLen = s.length();
        int len = (s.length() - 1) / 2;
        for (int i = 0; i < len ; i++) {
             if(Math.abs((int)s.charAt(i) - (int)s.charAt(i+1)) != 
             Math.abs((int)s.charAt(strLen-i-1) - (int)s.charAt(strLen-i-2))){
                 funnyReturn = "Not Funny";
                    break;
                }  
    
        }
        return funnyReturn;
        }
    
}
