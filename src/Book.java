// Concrete Element - Book item in the cart
public class Book implements CartItem {
    private final String title;
    private final double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void accept(CartVisitor visitor) {
        visitor.visit(this);
    }
}
