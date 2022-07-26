public class cafejava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 8.9; 
        double lattePrice = 4.2; 
        double cappucinoPrice = 2.7;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Noah";
        String customer3 = "Sam";
        String customer4 = "Jimmy"; 
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false; 
        boolean isReadyOrder3 = true; 
        boolean isReadyOrder4 = false; 
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1);
        if (isReadyOrder1){
            System.out.println(
                customer1 + readyMessage
            );
        } else {
            System.out.println( customer1 + pendingMessage);
        } 

        
        System.out.println(generalGreeting + customer2);
        if (isReadyOrder2){
            System.out.println(
                customer2 + readyMessage
            );
            System.out.println(displayTotalMessage + cappucinoPrice);
        } else {
            System.out.println( customer2 + pendingMessage);
        }


        System.out.println(generalGreeting + customer3);
        if (isReadyOrder3){
            System.out.println(
                customer3 + readyMessage
            );
            System.out.println(displayTotalMessage + lattePrice * 2 );
        } else {
            System.out.println( customer3 + pendingMessage);
        }
        
        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4){
            System.out.println(
                customer4 + readyMessage
            );
            System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));
        } else {
            System.out.println( customer4 + pendingMessage);
        }
        // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
    }
}
