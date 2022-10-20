
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
  
        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream
        list.stream().map(number -> number * 3).forEach(System.out::println);
    
        List<String> listStr = Arrays.asList("geeks", "gfg", "g",
        "e", "e", "k", "s");

        // Using Stream map(Function mapper) to
        // convert the Strings in stream to
        // UpperCase form
        List<String> answer = listStr.stream().map(String::toUpperCase).
        collect(Collectors.toList());

        // displaying the new stream of UpperCase Strings
        System.out.println(answer);

        List<String> strLen = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ",
                                          "Computer", "Science", "gfg");
  
        // Using Stream map(Function mapper) and
        // displaying the length of each String
        strLen.stream().map(str -> str.length()).forEach(System.out::println);
        strLen.stream().filter(str -> str.length() > 3).forEach(System.out::println);
    }
}
