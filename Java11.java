


import java.util.List;
import java.util.stream.Collectors;

public class Java11 {

    public static void main(String[] args) {
    System.out.println("Welcome:");
    String s1="cat";
	String s2 = "cat";
	String s3 = new String("cat"); 
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
	//  s1 == s2 // true
	//  s1 == s3 //false

    String multilineString = "Baeldung helps \n \n developers \n explore Java.";
    List<String> lines = multilineString.lines()
    .filter(line -> !line.isBlank())
    .map(String::strip)
    .collect(Collectors.toList());
    // assertThat(lines).containsExactly("Baeldung helps", "developers", "explore Java.");
    System.out.println("lines" + lines);
    }
    
} 