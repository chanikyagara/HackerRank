

import java.util.Arrays;

public class SumIsMultipleOfK {
    // Sum of two numbers in an array is multiple of 60
    public static void main(String[] args) {
        // int count = 0;
        int[] arr = {20, 40, 60, 80, 120, 150};
        // List<Integer> arrList = new ArrayList<>();
        // arrList.add(20);
        // arrList.add(40);
        // arrList.add(60);
        // arrList.add(80);
        // arrList.add(120);
        // arrList.add(150);
        System.out.println(arr);
        // for(int i=0; i<arrList.size(); i++){
        //     if(arrList.get(i)%60 == 0){
        //         System.out.println("Zero "+ arrList.get(i));
        //         arrList.remove(i);
        //     }
        //     System.out.println("in ForB "+arrList);
        //     arrList.set(i, arrList.get(i)%60);
        //     System.out.println("in ForA "+arrList);
        // }
        int count = 0;
        System.out.println(arr);
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i]+arr[j])%60 == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
        //Still need to improvise logic


    }
}
