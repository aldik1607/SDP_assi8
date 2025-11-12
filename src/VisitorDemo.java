import java.util.List;

public class VisitorDemo {
    public static void main(String[] args) {
        List<Element> items = List.of(
                new Book("Clean Code", 5000.0),
                new Fruit("Apple", 300.0, 0.3),
                new Book("Design Patterns", 7500.0),
                new Fruit("Banana", 400.0, 0.5)
        );

        Visitor printer = new PrintVisitor();
        System.out.println("=== Printing items ===");
        for (Element e : items) {
            e.accept(printer);
        }

        PriceSumVisitor priceSum = new PriceSumVisitor();
        for (Element e : items) {
            e.accept(priceSum);
        }
        System.out.printf("Total price = %.2f%n", priceSum.getTotal());
    }
}
