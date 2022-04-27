import java.util.ArrayList;
public class Order{

private String name;
private double total;
private boolean ready;
private ArrayList<Item> items;

public Order(){
    this.total=0.0;
    this.name="Guest";
  this.items= new ArrayList<Item>();
}

public Order(String name){
    this.total=0.0;
    this.name=name;
    this.items= new ArrayList<Item>();

   
}

public void addItem(Item item){
   this.items.add(item);
}

public String getStatusMessage(){
    if(this.ready == true){
        return "Your order is ready.";
    }
    
    return  "Thank you for waiting. Your order will be ready soon.";
    
}

 public void display(){
        System.out.println("Customer Name: " + this.name);
        double total = 0;
        for(int i = 0; i < items.size(); i++){
            System.out.println(items.get(i).getName() + " - " + items.get(i).getPrice());
            total += items.get(i).getPrice();
        }
        System.out.println("Total:" + total);
    }

    public Double getOrderTotal(){
        double total = 0;
        for(int i = 0; i < items.size(); i++){
            total += this.items.get(i).getPrice();
        }
        return total;
    }


public String getName(){
    return this.name;
}

public double getTotal(){
    return this.total;
}

public boolean getReady(){
    return this.ready;
}

// public ArrayList<Item> getItems(){
//     return this.items;
// }

public void setName(String name){
    this.name=name;
}

public void setTotal(double total){
    this.total=total;
}

public void setReady(boolean ready){
    this.ready=ready;
}

}