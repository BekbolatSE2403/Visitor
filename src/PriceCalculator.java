// Concrete Visitor 1 - Price Calculator
public class PriceCalculator implements CartVisitor {
    private double totalPrice = 0;

    @Override
    public void visit(Book book) {
        totalPrice += book.getPrice();
        System.out.println("Book: " + book.getTitle() + " - $" + book.getPrice());
    }

    @Override
    public void visit(Electronics electronics) {
        totalPrice += electronics.getPrice();
        System.out.println("Electronics: " + electronics.getName() + " - $" + electronics.getPrice());
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
