


// Concrete Element - Book item in the cart
// This class implements the CartItem interface and provides specific
//implementation for book products in the shopping cart.
public class Book implements CartItem {
    private final String title;
    private final double price;


    //Constructs a Book item with specified title and price.
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
