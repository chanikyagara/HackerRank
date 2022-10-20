

import java.util.ArrayList;
import java.util.List;

public class MinimumBribe {
    public static void main(String[] args) {
        List<Integer> q = new ArrayList<>(List.of(1,2,5,3,7,8,6,4));
        minimumBribeImpl(q);
    }
    public static void minimumBribeImpl(List<Integer> q){
        int diff = 0;
        for(int i=0;i<q.size();i++){
            if(q.get(i)>i){
                if((q.get(i)-1)-i > 2){
                   System.out.println("Too chaotic");
                   return;
                }
            }
        }
        Integer[] arr = new Integer[q.size()];
        arr = q.toArray(arr);
        System.out.println("arr: "+ arr+ " len: "+arr.length);
        for (int i = arr.length - 4; i >= 0; i--) {
            System.out.println("i: "+i);
            for (int j = i; j <= i + 2; j++) {

                System.out.println("j: "+j);
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                     diff++;
                }
                   
            }
        }
        System.out.println(diff);
        }
    
}
