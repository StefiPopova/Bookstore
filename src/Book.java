public class Book {
    private String title;
    private Author author;
    private BookType type;
    private int availables;
    private double price;


    public Book(){

    }

    public Book(String title, Author author, BookType type, int availables, double price){
        this.title=title;
        this.author=author;
        this.type=type;
        this.availables=availables;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public double getPrice(double priceReduction) {
        return (1 - priceReduction) * price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public int getAvailables() {
        return availables;
    }

    public void setAvailables(int availables) {
        this.availables = availables;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
