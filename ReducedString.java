
public class ReducedString {
    
public static void main(String[] args) {
    superReducedString("aaabccddd");
}
public static void superReducedString(String s) {

// SubString(begin index, end index)
// beginIndex :  the begin index, inclusive.
//*/ endIndex :  the end index, exclusive.
        boolean found = false;
        for (int i = 0; i < s.length() - 1; i++) {
            String a = s.substring(i, i + 1);
            String b = s.substring(i + 1, i + 2);
            if (a.equals(b)) {

                System.out.printf("if s 0,i: "+s.substring(0, i)+"\n");   
                s = s.substring(0, i) + s.substring(i + 2, s.length()); 
                System.out.printf("if s: "+s+"\n");
                superReducedString(s);
                found = true;
                break;
            }
        }
        if(!found){
            if(s.isEmpty()){
        		System.out.println("Empty String");
        	} else {
		        System.out.println(s);
        	}
        }
}
}
