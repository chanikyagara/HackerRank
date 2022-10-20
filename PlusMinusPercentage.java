
import java.util.ArrayList;
import java.util.List;

public class PlusMinusPercentage {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2, -1,-2,0));
        plusMinus(list);
    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int len = arr.size();
        float positive = arr.stream().filter(i -> i>0).count();
        float negitive = arr.stream().filter(i -> i<0).count();
        float zero = arr.stream().filter(i -> i==0).count();
        System.out.printf("%.6f\n",positive /len);
        System.out.printf("%.6f\n",negitive /len);
        System.out.printf("%.6f\n",zero /len);
        
        }
}
