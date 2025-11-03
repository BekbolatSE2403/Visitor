// Concrete Element - Electronics item in the cart
public class Electronics implements CartItem {
    private final String name;
    private final double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(CartVisitor visitor) {
        visitor.visit(this);
    }
}
