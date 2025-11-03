
// Concrete Visitor 1 - Price Calculator

//This visitor demonstrates how business logic for price calculation
// can be separated from the product classes and centralized in one place.

//Key benefit: If pricing rules change, we only modify this visitor class,
//not the individual product classes.
public class PriceCalculator implements CartVisitor {
    private double totalPrice = 0;

    // Calculates and accumulates the price for a Book item.
    // Simply adds the book's price to the total.
    @Override
    public void visit(Book book) {
        totalPrice += book.getPrice();
        System.out.println("Book: " + book.getTitle() + " - $" + book.getPrice());
    }

    //Calculates and accumulates the price for an Electronics item.
    @Override
    public void visit(Electronics electronics) {
        totalPrice += electronics.getPrice();
        System.out.println("Electronics: " + electronics.getName() + " - $" + electronics.getPrice());
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
