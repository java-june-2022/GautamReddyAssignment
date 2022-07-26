import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        // it adds 1 + 2 + 3 + ... +10 and returns the answer
        int sum = 0; 
        for(int i = 1; i <= 10; i++) {
            sum+=i; 
        } 
        return sum;
    }

    public double getOrderTotal(double[] listOfNumbers) { 
        double sum = 0; 

        for (double price: listOfNumbers) {
            sum += price; 
        }
        return sum;
    }

    // ArrayList = {1,2,3,4}
    // ArrayList.get(0)
    // List = [1,2,3,4]
    // List[0] 

    // ArrayList<String> = {"hi", "hello", "hey"}
    // ArrayList<Integer> = {1,2,3,4}

    // print f means variables in the same line
    // print ln means new line for everything

    public void displayMenu(ArrayList<String> menuItems) { 
        for (int id = 0; id < menuItems.size(); id++) {
            System.out.printf("%s %s \n",id,menuItems.get(id));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if (menuItems.size() != prices.size()){
            return false;
        }
        for (int id = 0; id < menuItems.size(); id++) {
            System.out.printf(" %s %s -- $%.2f\n",id,menuItems.get(id), prices.get(id));
        }
        return true;
    }

    public void addCustomer(ArrayList<String> customerList) {
        boolean finished = false; 
        String input; 
        while (!finished) {
            System.out.println("Please enter a customer name of press letter Z to quit:");
            input = System.console().readLine();
            if (input.equals("Z")) {
                finished = true;
                return;
            }
            else{
                customerList.add(input);
            }
        }
    }

    // cupcakes, $2, 3

    // cupcakes

    // cupcake 1 $2
    // cupcake 2 $4
    // cupcake 3 $6


    public void printPriceChart(String productName,double price, int maxQuantity) {
        System.out.printf("%s\n", productName);
        for(int quantity = 1; quantity <= maxQuantity; quantity++) {
            System.out.printf("%s - $%.2f\n", quantity, quantity * price);
        }

        System.out.println("");
    }

}