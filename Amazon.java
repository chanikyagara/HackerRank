
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Amazon {
    public static void main(String[] args) {
        // In a given array, find minimum number and substarct it from the each number in the array and 
        // find how many times to make all elements to zero.
        List<Integer> list  = new ArrayList<>(List.of(4,2,3,4));
        Collections.sort(list);
        int minTimes = 0;
        minTimes = numOfTimes(list, minTimes);
        System.out.println(minTimes);

    }

    public static int numOfTimes(List<Integer> sortedList, int minTimes) {
       
        if(!sortedList.isEmpty()){
            int minVal = sortedList.get(0);
            List<Integer> newList = new ArrayList<>();

            // for (int i = 0; i < sortedList.size(); i++) {
            //     sortedList.set(i, sortedList.get(i) - minVal);
            //     if (sortedList.get(i) != 0) {
            //         newList.add(sortedList.get(i));
            //     } 
            // }
            // for loop can be replaced by below streams
            newList = sortedList.stream().map(i->i-minVal).filter(i->i!=0).collect(Collectors.toList());

            System.out.println(newList);
            minTimes++;
            minTimes = numOfTimes(newList, minTimes);
        }
        return minTimes;
    }
}
