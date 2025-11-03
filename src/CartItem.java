


// Item interface - the Element in Visitor Pattern
public interface CartItem {
    // Accept method allows visitors to perform operations on cart items
    // The accept() method enables the double dispatch mechanism by allowing visitors
    void accept(CartVisitor visitor);
}
