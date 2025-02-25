public class Customer {
    String name;
    CustomerType type;
    double discount;

    public Customer(String name, CustomerType type) {
        this.name = name;
        this.type = type;
        setDiscount();
    }

    public void setDiscount() {
        if (type.equals("Regular")) {
            discount = 0.05;
        } else if (type.equals("Premium")) {
            discount = 0.1;
        } else if (type.equals("VIP")) {
            discount = 0.2;
        }
    }
}
