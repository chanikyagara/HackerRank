


public class StringSimilarity {
    public static void main(String[] args) {
        stringSimilarity("ababaa");
    }
    public static void stringSimilarity(String s) {
        // Write your code here
    //     int result = s.length();
    //     List<String> subStrs = new ArrayList<>();
    //     for (int i = 1; i < s.length(); i++) {
    //         subStrs.add(s.substring(i,s.length()));
    //     }
    // //    System.out.println(subStrs);
    //     for (int i = 0; i < subStrs.size(); i++) {
    //         // System.out.println(subStrs.get(i));
    //         char[] c = subStrs.get(i).toCharArray();
    //         for (int j = 0; j < c.length ; j++) {
    //             if(s.charAt(j) == c[j]){
    //                 result++;
    //             } else{
    //                 break;
    //             }       
    //             // System.out.printf(" j: "+ j+ " s.j: "+s.charAt(j)+" c.j: "+c[j]+" result: "+result+"\n");         
    //         }
    //         System.out.printf("substr result: "+ result+"\n");
    //     }
    
    /* Solution 2*/
        // int len = s.length();
        // int sum = len;
        // for(int i=1; i<len;i++){
        //     int count = 0;
        //     for(int j=0,k=i; j<len && k<len; j++,k++){
        //           if(s.charAt(k) == s.charAt(j)){
        //               count++;
        //           }else{
        //               break;
        //           }
        //     }
        //     sum = sum + count;
        // }
        // System.out.println(sum);

    /* Solution 3 */

        char[]arr=s.toCharArray();
		int length=arr.length;
		int count=length;
		for(int i=1;i<length;i++){
			int len=length - i;
			int j=0;
			for(;j<len;j++)
				if(arr[j]!=arr[j+i]){
					break;
				}
			count+=j;
		}
		System.out.println(count);
    }
        
}
