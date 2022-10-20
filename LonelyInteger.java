

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,3,2,1));
        unique(list);
    }
    public static void unique(List<Integer> list) {
        System.out.println(list.size());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer elem : list) {
            if (!map.containsKey(elem)) {
                map.put(elem, 1);
            } else {
                map.put(elem, map.get(elem)+1);
            }
        }

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
               System.out.println(entry.getKey());
            }
        }
    }
}
