import java.util.Set;
import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Sparta", "Many, many years ago");
        trackList.put("Bismarck", "From the mist, a shape,");
        trackList.put("Panzerkampf", "Into the motherland");
        System.out.println(trackList.get("Sparta"));
        System.out.println(trackList);
        // get the keys by using the keySet method
       
    }
}