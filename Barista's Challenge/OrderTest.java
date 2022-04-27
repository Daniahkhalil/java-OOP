import java.util.ArrayList;
public class OrderTest {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("latte",2.5);
        Item item2 = new Item("drip",3.5);
        Item item3 = new Item("capuccino",4.5);
        Item item4 = new Item("mohca",5.5);

        
   
    
        // Order variables -- order1, order2 etc.
        Order order1=new Order();
        Order order2=new Order();
        Order order3=new Order("Dania");
        Order order4=new Order("Samia");
        Order order5=new Order("Talia");

        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item3);
        order2.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item2);
        order4.addItem(item1);
        order4.addItem(item1);
        order5.addItem(item3);
        order5.addItem(item4);

        order3.display();
        System.out.println(order3.getStatusMessage());







    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.getName());
        System.out.printf("Total: %s\n", order1.getTotal());
        System.out.printf("Ready: %s\n", order1.getReady());
    }
}