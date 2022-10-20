

import java.util.ArrayList;
import java.util.List;

public class Lengths {
    public static void main(String[] args) {
        String s = "abcde";
        String[] strArr = {"ab","cd","ef","gh","ij"};
        List<String> strList = new ArrayList<>(List.of("ab","cd","ef","gh","ij"));
        System.out.println("String length: "+ s.length());
        System.out.println("String Array length: "+ strArr.length);
        System.out.println("String List length: "+ strList.size());

        char[] chArr = s.toCharArray();
        System.out.println("Char Array length: "+ chArr.length);
        for (char c : chArr) {
            System.out.println(c);
        }
    }
}
