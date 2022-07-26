import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items

        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.total = 18;
        order1.ready = true;
    
        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = 54;
        order2.ready = true;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = 24;
        order3.ready = true;

        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = 62;
        order4.ready = false;


        // Order variables -- order1, order2 etc.

        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 2;
    
        Item item2 = new Item(); 
        item2.name = "latte";
        item2.price = 8; 

        Item item3 = new Item();
        item3.name = "drip coffee"; 
        item3.price = 20;

        Item item4 = new Item(); 
        item4.name = "capuccino";
        item4.price = 12;
        
        order2.items.add(item1);
        order2.total = order2.total + item1.price;

        order3.items.add(item4);
        order3.total = order3.total + item4.price;

        order4.items.add(item2);
        order4.total = order4.total + item2.price;

        order4.items.add(item2);
        order4.items.add(item2);


        // How to add 100 lattes. You have to use a foreloop 
        // for(int i = 0; i <100; i++){
        //     order4.items.add(item2);
        // }
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
    }
}
