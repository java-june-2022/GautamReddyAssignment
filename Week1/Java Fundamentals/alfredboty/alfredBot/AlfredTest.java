public class AlfredTest {


    public static void main(String[] args) { 
        AlfredQuotes  alfredBot = new AlfredQuotes();

        // String greeting = alfredBot.basicGreeting();
        // System.out.println(greeting);

        System.out.println(alfredBot.basicGreeting());


        // String guestGreeting = alfredBot.guestGreeting("Eddy", "evening");
        // System.out.println(guestGreeting);

        System.out.println(alfredBot.guestGreeting("Eddy", "evening"));

        // String dateAnnouncement = alfredBot.dateAnnouncement();
        // System.out.println(dateAnnouncement);

        System.out.println(alfredBot.dateAnnouncement());

        String withAlexis = alfredBot.answeringBeforeAlexis("Alexis, bring me water!");
        System.out.println(withAlexis);

        String withAlfred = alfredBot.answeringBeforeAlexis("Alfred, bring me water!");
        System.out.println(withAlfred);

        String withNeither = alfredBot.answeringBeforeAlexis( "Bring me water");
        System.out.println(withNeither);

        System.out.println(alfredBot.guestGreeting("evening"));

        System.out.println(alfredBot.guestGreeting());
    }
}
