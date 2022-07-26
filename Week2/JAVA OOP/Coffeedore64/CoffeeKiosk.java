import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price) { 
        Item newItem = new Item(name,price); 
        this.menu.add(newItem);
        int index = menu.indexOf(newItem); 
        newItem.setIndex(index);
    }
    public void displayMenu() {
        for(Item i: this.menu) { 
            System.out.printf("%s %s -- $%.2f\n", i.getIndex(), i.getName(), i.getPrice());
        }
    }

    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order newOrder = new Order(name);

        this.displayMenu();
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
            // Get the item object from the menu, and add the item to the order
            int index = Integer.parseInt(itemNumber);
            Item wantedItem = this.menu.get(index);
            newOrder.addItem(wantedItem);
            // Ask them to enter a new item index or q again, and take their input

            System.out.println("Please enter another menu item index or q to quit");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        System.out.println("Your order:");
        newOrder.display();
        System.out.printf("Your total is: %.2f", newOrder.getOrderTotal());
        
    }
    public void addMenuItemByInput() { 
        String isCompleted = "y"; 
        while(isCompleted.equals("y")) { 
            System.out.println("Please enter the name of the product:");
            String itemName = System.console().readLine();
            System.out.println("Please enter the price of the product:");
            String itemPrice = System.console().readLine();
            while(itemPrice.isEmpty()) {
                System.out.println("Please enter a valid price"); 
                itemPrice = System.console().readLine(); 
            }
            double price = Double.parseDouble(itemPrice);
            addMenuItem(itemName, price); 
            isCompleted = System.console().readLine().toLowerCase();
        }
 
    }

}