
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GridChallenge {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallengeImpl(List<String> grid) {
    // Write your code here
    char[] ch = {};
    String result = "YES";
    // StringBuffer sb = new StringBuffer();
    System.out.println(grid);
    for (int i = 0; i < grid.size(); i++) {
        ch = grid.get(i).toCharArray();
        Arrays.sort(ch);
        String s = new String(ch);
        grid.set(i, s);
      System.out.println(ch);
    }
    System.out.println("Updated: " +grid.toString());
      
        // System.out.println(grid.get(0).length());
    for (int i = 1; i < grid.size(); i++) {
        System.out.println("grid.get(i): "+ grid.get(i) + " : "+ grid.get(i).length());
        for (int j = 0; j < grid.get(i).length(); j++) {
            if ((int)grid.get(i-1).charAt(j) > (int)grid.get(i).charAt(j)) {
            result = "NO";
        }
        }

    }
    return result;
    }

// public class Solution {
    public static void main(String[] args) throws IOException {
      List<String> grid = new ArrayList<>(List.of("kc", "iu"));
                String result = GridChallenge.gridChallengeImpl(grid);
                System.out.println(result);

    
}
}
