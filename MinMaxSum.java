
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1,3,5,7,9));
        miniMaxSum(arr);
    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        // arr.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
        List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());
        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < sortedList.size() - 1; i++) {
            minSum += sortedList.get(i);         
        }
        for (int i = 1; i < sortedList.size(); i++) {
            maxSum += sortedList.get(i);         
        }
        System.out.println(minSum + " " + maxSum);
        }
}
