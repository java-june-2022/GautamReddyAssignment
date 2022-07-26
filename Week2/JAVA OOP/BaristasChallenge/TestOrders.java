import java.util.ArrayList;
public class TestOrders { 

    public static void main(String[] args) { 
        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Chuck");
        Order order4 = new Order("Francis");
        Order order5 = new Order("Oswald");

        Item item1 = new Item("cupcakes", 2.00);
        Item item2 = new Item("ice cream", 5.00);
        Item item3 = new Item("chocolate", 1.00);

        order1.addItem(item1);
        order1.addItem(item2);
        order1.display();

        order2.addItem(item1);
        order2.addItem(item2);
        order2.display();

        order3.addItem(item1);
        order3.addItem(item3);
        order3.display();

        order4.addItem(item3);
        order4.addItem(item2);
        order4.display();

        order5.addItem(item1);
        order5.addItem(item2);
        order5.display();

        order1.setReady();
        System.out.println(order1.getOrderStatus());
        System.out.println(order1.getOrderTotal());

    }
}