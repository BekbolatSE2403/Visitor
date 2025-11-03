// Main class to demonstrate the shopping cart system
import java.util.List;

public class ShoppingCartDemo {
    public static void main(String[] args) {

        // Create shopping cart with only two items
        List<CartItem> cart = List.of(
                new Book("Design Patterns", 45.99),
                new Electronics("Laptop", 999.99)
        );

        // Create visitors for different operations
        PriceCalculator priceVisitor = new PriceCalculator();
        DiscountCalculator discountVisitor = new DiscountCalculator();

        // Calculate total price
        System.out.println("PRICE CALCULATION");
        cart.forEach(item -> item.accept(priceVisitor));
        System.out.println("Total Price: $" + priceVisitor.getTotalPrice());

        // Calculate discounts
        System.out.println("\nDISCOUNT CALCULATION");
        cart.forEach(item -> item.accept(discountVisitor));
        System.out.println("Total Discount: $" + discountVisitor.getTotalDiscount());

        // Calculate final total
        double finalTotal = priceVisitor.getTotalPrice() - discountVisitor.getTotalDiscount();
        System.out.println("\nTOTAL");
        System.out.println("Final Amount to Pay: $" + finalTotal);
    }
}
