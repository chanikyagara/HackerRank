
import java.util.ArrayList;
import java.util.List;

public class FlippingMatrix {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.get(0).add(1);
        matrix.get(0).add(2);
        matrix.get(1).add(3);
        matrix.get(1).add(4);
        flippingMatrixImpl(matrix);
    }
    public static int flippingMatrixImpl(List<List<Integer>> matrix) {
        int sum = 0;
        int size = matrix.size();
        System.out.println(size);
        for (int i = 0; i < size/2; i++) {
            for (int j = 0; j < size/2; j++) {
                sum += Math.max( matrix.get(i).get(j), 
                    Math.max( matrix.get(i).get(size-1-j),
                    Math.max( matrix.get(size-1-i).get(j), 
                        matrix.get(size-1-i).get(size-1-j))
                    )  
                );
            }            
        }
        return sum;
    }
}
