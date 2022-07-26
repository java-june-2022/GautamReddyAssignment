import java.util.HashMap;
import java.util.Set; 


public class Hashmatique {
    public static void Challenge() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Mr. Moom", "Its a real cold moon...");
        map.put("Dog Day", "Dog day baybee");
        map.put("For whom the bell", "Look to the sky rhy befor u die");
        map.put("LALAL", "Who boy hahah LALA");

       String val = map.get("Dog Day");
       System.out.print(val);


        for (String key : map.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, map.get(key)));
        }


    }
}