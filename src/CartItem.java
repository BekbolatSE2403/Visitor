// Item interface - the Element in Visitor Pattern
public interface CartItem {
    // Accept method allows visitors to perform operations on cart items
    void accept(CartVisitor visitor);
}
