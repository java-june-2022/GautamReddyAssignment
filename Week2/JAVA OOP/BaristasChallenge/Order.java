import java.util.ArrayList;

// Here we're creating a new data type called Order
public class Order {

    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null

    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "guest";
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) { 
        this.name = name; 
        this.ready = false; 
        this.items = new ArrayList<Item>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    // ORDER METHODS

    public void addItem(Item item){
        this.items.add(item);
    }

    public void display(){
        System.out.printf("Customer Name: %s\n", this.name);
        for (Item item: this.items){
            System.out.printf("%s -- $%.2f\n", item.getName(), item.getPrice());
        }
    }

    public void setReady(){
        this.ready = true;
    }

    public Boolean getReady(){
        return this.ready;
    }

    public String getOrderStatus(){
        if (this.ready){
            return "Your order is ready!";
        }
        else{
            return "Your order will be ready soon.";
        }
    }

    public double getOrderTotal() { 
        double total = 0.0; 
        for(Item i: this.items) {
            total += i.getPrice();
        }
        return total;
    }
    // Most of your code will go here,
    // so implement the getters and setters first!

    // GETTERS & SETTERS

}
