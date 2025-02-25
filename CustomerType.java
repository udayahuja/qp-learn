public enum CustomerType {

    Regular("Regular", 0.05),
    Premium("Premium", 0.1),
    Vip("Vip", 0.2);

    String type;
    double discount;

    CustomerType(String type, double discount) {
        this.type = type;
        this.discount = discount;
    }
}
