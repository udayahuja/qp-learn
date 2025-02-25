import java.util.*;

public class Order {
    Customer customer;
    List<Item> items;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getTotal() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public double getDiscount(double totalPrice) {
        return totalPrice - (totalPrice * customer.getDiscount());
    }

    public void printOrder() {
        double totalPrice = getTotal();
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items: " + items);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discounted Price: " + getDiscount(totalPrice));
    }
}
