
public class OrderManagementSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", CustomerType.Vip);
        Order order = new Order(customer);

        addItems(order);

        order.printOrder();

        generateInvoice(order);
    }

    private static void addItems(Order order) {
        order.addItem(new Item("Laptop", 1000));
        order.addItem(new Item("Mouse", 50));
        order.addItem(new Item("Keyboard", 80));
    }

    public static void generateInvoice(Order order) {
        double totalPrice = order.getTotal();
        System.out.println("Generating Invoice...");
        System.out.println("Customer: " + order.getCustomerName());
        System.out.println("Total: $" + totalPrice);
        System.out.println("Discounted Total: $" + order.getDiscount(totalPrice));
        System.out.println("Items: " + order.items);
        System.out.println("Thank you for shopping with us!");
    }
}
