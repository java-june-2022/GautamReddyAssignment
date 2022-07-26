import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return String.format("Greetings good, %s, %s. pleasure to meet you my dear", dayPeriod, name);
    }

    public String guestGreeting(String dayPeriod){
        return String.format("Good %s! How are you?", dayPeriod);
    }

    public String guestGreeting(){
        String pattern = "k";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());

        String dayTime ="morning";

        if (Integer.parseInt(date) >= 12){
            dayTime = "afternoon";
        }
        if (Integer.parseInt(date) >= 18){
            dayTime = "evening";
        }
        return String.format("Good %s! How are you?", dayTime);
    }

    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("It is currently %s", new Date());
    }
    
    public String answeringBeforeAlexis(String phrase) {
        if(phrase.indexOf("Alexis") != -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }

        if (phrase.indexOf("Alfred") != -1) {
            return "At your service, naturally. How may I be of assistance?";
        }

        return "Right. And with that I shall retire.";
        
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}





