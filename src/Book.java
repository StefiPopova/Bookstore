public class Book {
    private String title;
    private Author author;
    private BookType type;
    private int availables;
    private double price;

    public double getPrice() {
        return price;
    }
    public double getPrice(double priceReduction) {
        return (1 - priceReduction) * price;
    }

}
