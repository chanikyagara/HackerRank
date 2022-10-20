
import java.util.ArrayList;
import java.util.List;

public class Amazon2 {
    public static void main(String[] args) {
        // input array [4,9,3,5,7] m=5 d=2
        //count of indexes (1,2) - c1
        //count of indexes (1,4) - c2
        //count of indexes (1,5) - c3
        // (i+1) always greater than the i
        // find maximum of c1,c2 and c3.
        
        
        int max = 0;
        List<Integer> list  = new ArrayList<>(List.of(4,8,9,6,7));
        int c12 = list.get(1);
        int c14 = list.get(3);
        int c14Hold = 0;
        int c15 = list.get(4);

        int len = list.size()-1;
        for (int i = len; i > 0; i--) {

            if (i>0 && i<2) {
                if (list.get(i) > list.get(i - 1)) {
                    c12 += list.get(i-1);
                } else{
                    c12 += list.get(i) - 1;
                }
            } 
            if(i>0 && i<4){
                if (c14Hold !=0) {
                    if (c14Hold > list.get(i - 1)) {
                        c14 += list.get(i-1);
                    } else{
                        c14Hold = c14Hold - 1;
                        c14 += c14Hold - 1;
                    }
                } else {
                    if (list.get(i) > list.get(i - 1)) {
                        c14 += list.get(i-1);
                    } else{
                        c14Hold = list.get(i) - 1;
                        c14 += list.get(i) - 1;
                    }
                }
                if(c14Hold > list.get(i - 1)) {

                
            }
            if(i>0 && i<5){
                if (list.get(i) > list.get(i - 1)) {
                    c15 += list.get(i-1);
                } else{
                    c15 += list.get(i) - 1;
                }
            }

            if (c12 > c14 && c12 > c15) {
                max = c12;
            } else if (c14 > c12 && c14 > c15){
                max = c14;
            } else {
                max = c15;
            }
            System.out.println(max);
        }
    }
}
}
