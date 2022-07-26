import java.util.ArrayList;
public class CafeUtil {

// Cafe Java wants to implement a reward system for customers who always buy more drinks than they did the week before.
//  To calculate how many drinks they need after 10 weeks, write a method that sums together every consecutive integer 
//  from 1 to 10 and returns the sum. 
//  In other words, add 1 + 2 + 3.. and so on up to 10 and return the result.

// Test your code before moving on! Don't forget to make an instance of your CafeUtil class to use in the test file. The number printed should be 55.

// Ninja Bonus:  Add a parameter, numWeeks so that an admin can change the number from 10 to whatever they want.


    public int getStreakGoal() {
        int sum = 0; 

        for (int i = 1; i <=10; i = i + 1) {
            sum = sum + i; 
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) { 

        double total = 0;

        for(int i = 0; i < prices.length; i++) {
            total = total + prices[i];
        }
        return total;
    } 

    // another Way: 

    // public double getOrderTotal(double[] lineItems) {
    //     double sum = 0;
        
    //     for (double price: lineItems) {
    //         sum+= price;
    //     }
    //     return sum;

    // }


    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s \n", i, menuItems.get(i));
        }
    }

    // Given an ArrayList of menu items (strings), print out each index and menu item. 
    
    // Sample output given an  ArrayList with the items "drip coffee",  "cappuccino",  "latte" and  "mocha"
    
    // 0 drip coffee
    // 1 cappuccino
    // 2 latte
    // 3 mocha

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello" + userName);
        System.out.printf("There are %s people in front of you", customers.size());
        customers.add(userName);

    }



}
