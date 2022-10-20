
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1,1,3,2,1));
        countingSort(arr);
    }
    public static void countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>(Collections.nCopies(100, 0));
        System.out.println(result.size());
       
        for (Integer a : arr) {
            if(result.get(a) != 0){
                result.set(a, result.get(a) + 1);
            } else {
                result.set(a, 1);
            }
        }
        System.out.println(result);
    
        }
    
}
