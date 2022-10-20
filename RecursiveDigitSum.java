
public class RecursiveDigitSum {
    public static void main(String[] args) {
       int out = superDigit("861568688536788", 100000);
       System.out.println(out);
    }

    public static int superDigit(String n, int k) {
        // Write your code here
        

/******* SOLUTION 1 ********** */
        //  n = n.chars().mapToLong(Character::getNumericValue).sum() * k + "";
        //  return (n.length()>1?superDigit(n, 1):Character.getNumericValue(n.charAt(0)));

/******* SOLUTION 2 *********** */
        int temp = findSum(n) * k;
        temp = 999;
        if(temp>9){
            System.out.println(temp);
            temp = findSum(String.valueOf(temp));
        }

        return temp;
    }
    
    static int findSum(String num){
        if(num.length() == 1){
            return Integer.parseInt(num);
        }
        
        int sum =0;
        for(int i=0; i<num.length(); i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        
        return findSum(String.valueOf(sum));
    }

/******* SOLUTION 3 *********** */

        // long m = Integer.parseInt(n); // --> Has limitation
        // // int superDigit = 0;
        // long sum = 0;
        // sum = addDigits(m);
        // System.out.println("sum aft add: "+ sum + " k: "+ k);
        // sum = sum * k;
        // while (sum > 9){
        //     // System.out.println("sum: "+ sum);
        //     sum = addDigits(sum);
        // }
        
        // // System.out.println("sum: " + sum+ " n: "+n);
        // return (int)sum;
        // }
        
        // public static long addDigits(long m){
        //     // System.out.println("meth: "+ m);
        //     long n = 0;
        //     while (m!=0) {
        //         n += m %10;
        //         m = m /10;
        //     }
        //     // System.out.println(n);
        //     return n;
        // }
    
    
    
}
