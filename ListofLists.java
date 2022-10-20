
import java.util.ArrayList;

public class ListofLists {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
        System.out.println(listOfLists);
        int numberOfLists = 3;
        for (int i = 0; i < numberOfLists; i++) {
            listOfLists.add(new ArrayList<>(4));
        }

        System.out.println(listOfLists);

        listOfLists.get(0).add(1);
        listOfLists.get(1).add(2);
        listOfLists.get(2).add(3);

        System.out.println(listOfLists);

        listOfLists.get(0).add(11);
        listOfLists.get(1).add(22);
        listOfLists.get(2).add(10);

        System.out.println(listOfLists);
        System.out.println(listOfLists.get(2).get(1));

        for (int i = 0; i < numberOfLists; i++) {
            for (int j = 0; j < listOfLists.get(i).size(); j++) {
                System.out.println(listOfLists.get(i).get(j));
                
            }
            
        }
}
}
