public class PrintVisitor implements Visitor {

    @Override
    public void visit(Book book) {
        System.out.printf("Book: '%s', price = %.2f%n", book.getTitle(), book.getPrice());
    }

    @Override
    public void visit(Fruit fruit) {
        System.out.printf("Fruit: %s, %.2f kg, price/kg = %.2f (total = %.2f)%n",
                fruit.getName(), fruit.getWeight(), fruit.getPricePerKg(),
                fruit.getPricePerKg() * fruit.getWeight());
    }
}
