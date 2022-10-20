
import java.util.ArrayList;
import java.util.List;

public class DiogonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.get(0).add(1, 1);
        result(arr);
    }

    public static int result(List<List<Integer>> arr) {
    // Write your code here
    int result =0;
    int diog1 = 0;
    int diog2 = 0;
    int len = arr.size() -1;
    System.out.println(arr.size() + " "+arr);
    for (int i =0,j = 0, k=len; i < arr.size() && j < arr.size() && k > 0; i++,j++,k--) {
        diog1 += arr.get(i).get(j);
        diog2 += arr.get(i).get(k);

        //** Dont use two for loops for performance issues */
        // for (int j = 0; j < arr.size(); j++) {
        //     System.out.println("i: "+i+" j: "+j + " " +arr.get(i).get(j));
        //     if (i + j == len) {
        //         diog2 += arr.get(i).get(j);
        //         System.out.println("diog2: " + diog2);
        //     } 
        //     if (i == j) {
        //         diog1 += arr.get(i).get(j);
        //         System.out.println("diog1: " + diog1);
        //     } 
        // }
        
    }
    result =  Math.abs(diog1 - diog2);
    return result;

    }

}

