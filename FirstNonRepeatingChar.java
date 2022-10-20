

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "abcabcddeefff";
        int[] chCount = new int[26];
        char[] sch = s.toCharArray();
        System.out.println(s);
        for(char c: sch){
            // System.out.println("Bchar: " + c + " and count " + chCount[c - 'a']);
            chCount[c - 'a']++;
            System.out.println("Achar: " + c + " and count " + chCount[c - 'a']);
        }
        for(char c: sch){
            if (chCount[c - 'a'] == 1){
                System.out.println(c);
                break;
            } 
        }
        System.out.println("_");
    }
}
