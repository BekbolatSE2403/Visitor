


// Visitor component
// This design allows adding new operations without modifying the element classes,
//following the Open/Closed Principle.

public interface CartVisitor {
    // Defines an operation to be performed on a Book object.
    void visit(Book book);
    // Defines an operation to be performed on an Electronics object.
    void visit(Electronics electronics);
}
