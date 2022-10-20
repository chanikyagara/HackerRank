
public class PalindromeIndex {
    public static void main(String[] args) {
        String s = "aaab";
        int n = s.length() - 1;
        for (int i = 0, j=n; i < j; i++, j--) {
            
            if (s.charAt(i) != s.charAt(j)) {
                if(s.charAt(i+1) == s.charAt(j)){
                    System.out.println(i);
                } else if(s.charAt(i) == s.charAt(j-1)){
                    System.out.println(j);
                }
            } 
            
        }
        System.out.println("-1");
        }
        public static int palindromeIndex(String s) {
            // Write your code here
              int palindromeIndex = -1;
            int len = s.length();
        
            for (int i = 0; i < len / 2; i++) {
              if (s.charAt(i) != s.charAt(len - i - 1)) {
                if (i + 1 < len) {
                  boolean isRightStringValidPalindrome = isValidPalindrome(
                    s.substring(i + 1, len - i)
                  );
                  if (isRightStringValidPalindrome) return i;
                  return len - i - 1;
                }
              }
            }
        
            return palindromeIndex;
          }
        
          public static boolean isValidPalindrome(String str) {
            int len = str.length();
        
            for (int i = 0; i < len / 2; i++) {
              if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
              }
            }
        
            return true;
          }
        }
    

        
