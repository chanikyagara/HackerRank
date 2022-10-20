
public class CaesarCipher {
    public static void main(String[] args) {
        String s = "z"; // Replace the each charecter with ascii value + k ;
        int k = 2;
    int a = 0;
    int n = 0;
    char c = ' ';
    StringBuilder output = new StringBuilder("");
    for (int i = 0; i < s.length(); i++) {
            
        n = (int)s.charAt(i);
        System.out.println("n: "+ n);
        a = n + k;
        System.out.println("a: "+ a);
        if (n >= 65 && n <= 90){
            if (a > 90) {
                a = 65 + (a - 91) % 26;
            }            
            c = (char)a;
            output.append(c);
        } else if (n >= 97 && n <= 122) {    
            if (a > 122) {
                a = 97 + (a - 123) % 26;
            }            
            System.out.println("a af: "+ a);
            c = (char)a;
            System.out.println("c: "+ c);
            output.append(c);
        } else {
            output.append(s.charAt(i));
        }

        
    }

    System.out.println(s+ " is replaced by " +output.toString());
    }
    
}
