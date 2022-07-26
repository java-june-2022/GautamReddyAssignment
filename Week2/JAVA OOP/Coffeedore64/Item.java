public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    private int index;

    public Item(){
        this.name = "item";
        this.price = 1.00;

    }

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price, int index){
        this.name = name;
        this.price = price;
        this.index = index;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }
    
    public void setIndex(int index) { 
        this.index = index; 
    }
    public int getIndex(){
        return this.index;
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
