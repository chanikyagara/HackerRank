
public class TimeConversion {
    public static void main(String[] args) {
        milataryTime("11:59:40PM");
    }

    public static void milataryTime(String s){
    int hour = Integer.parseInt(s.substring(0, 2)) % 12;
    // System.out.println(s.substring(8, 10));
    if(s.substring(8, 10).endsWith("PM")) {
        hour += 12; 
    }
    String time24 = hour + s.substring(2, 8) ;
    System.out.println(hour +" "+ time24);

    String time24f = String.format("%02d",hour) + s.substring(2, 8) ;
    System.out.println(hour +" "+ time24f);
    }
}
