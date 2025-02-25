public class Customer {
    private String name;
    private CustomerType type;

    public Customer(String name, CustomerType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public CustomerType getCustomerType() {
        return this.type;
    }

    public double getDiscount() {
        return this.type.discount;
    }

}
