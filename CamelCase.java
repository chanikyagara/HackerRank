
public class CamelCase {
    
public static void main(String[] args) {
    String s = "saveChangesInTheEditor";
    int count = 1;
    for (int i = 0; i < s.length(); i++) {
        // System.out.printf("i: "+ i+" char: "+ s.charAt(i)+" ascii: "+ (int)s.charAt(i));
        if((int)s.charAt(i) <= 90 && (int)s.charAt(i) >= 65){
            count++;
        }
    }
    System.out.println(count);
}
}
