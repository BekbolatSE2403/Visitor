// Concrete Visitor 2 - Discount Calculator
public class DiscountCalculator implements CartVisitor {
    private double totalDiscount = 0;

    @Override
    public void visit(Book book) {
        // Books get 10% discount
        double discount = book.getPrice() * 0.10;
        totalDiscount += discount;
        System.out.println("Book discount: $" + discount);
    }

    @Override
    public void visit(Electronics electronics) {
        // Electronics get 5% discount
        double discount = electronics.getPrice() * 0.05;
        totalDiscount += discount;
        System.out.println("Electronics discount: $" + discount);
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }
}