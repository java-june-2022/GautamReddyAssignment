public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;

    public Item(){
        this.name = "item";
        this.price = 1.00;
    }

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    
    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    
    // GETTERS & SETTERS  - for name and price
    
}
