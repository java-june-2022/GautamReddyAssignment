import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
  public static void main(String[] args) {

    /*
     * You will need add 1 line to this file to create an instance
     * of the CafeUtil class.
     * Hint: it will need to correspond with the variable name used below..
     */
    CafeUtil appTest = new CafeUtil();

    /* ============ App Test Cases ============= */

    // System.out.println("\n----- Streak Goal Test -----");
    // System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());

    // System.out.println("----- Order Total Test-----");
    // double[] listOfNumbers = { 3.5, 1.5, 4.0, 4.5 };
    // System.out.printf("Order total: %s \n\n", appTest.getOrderTotal(listOfNumbers));

    // System.out.println("----- Display Menu Test-----");

    // ArrayList<String> menu = new ArrayList<String>();
    // ArrayList<Double> prices = new ArrayList<Double>();
    // menu.add("drip coffee");
    // prices.add(2.00);
    // menu.add("cappuccino");
    // prices.add(2.50);
    // menu.add("latte");
    // prices.add(4.50);
    // menu.add("mocha");
    // prices.add(3.00);

    // appTest.displayMenu(menu, prices);

    System.out.println("\n----- Add Customer Test-----");
    ArrayList<String> customers = new ArrayList<String>();
    // --- Test 4 times ---
  
    appTest.addCustomer(customers);


    // System.out.println("\n ----- Price Chart Test -----");
    // appTest.printPriceChart("cupcakes", 2, 3);
  }
}
