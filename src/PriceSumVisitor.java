public class PriceSumVisitor implements Visitor {
    private double total = 0.0;


    @Override
    public void visit(Book book) {
        total += book.getPrice();
    }

    @Override
    public void visit(Fruit fruit) {
        total += fruit.getPricePerKg() * fruit.getWeight();
    }

    double getTotal() { return total; }

}
