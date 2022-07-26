import java.util.ArrayList;
public class TestOrders { 

    public static void main(String[] args) { 
        CoffeeKiosk ck = new CoffeeKiosk();
        ck.addMenuItem("milk", 2.00);
        ck.addMenuItem("coffee", 1.50);
        ck.addMenuItem("cupcakes", 1.00);

        ck.newOrder();

    }

}