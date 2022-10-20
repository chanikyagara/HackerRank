
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5,1,2,3));
        System.out.println(list);
        Integer[] intArray = list.toArray(new Integer[0]);
        System.out.println(intArray[1]);
        // sort
        Collections.sort(list);
        System.out.println(list);
    }
}
