import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> books;
    private int totalSoldBooks;
    private int totalProfit;

    BookStore(){
        books = new ArrayList<>();
        totalSoldBooks = 0;
        totalProfit = 0;
    }


    void sellBook(String bookName, int quantity){
        int id = -1;
        for(Book book : books){
            if(book.getTitle().equals(bookName)){
                if(book.getAvailables()<quantity) {
                    System.out.println("Няма налични бройки.");
                }
                else{
                        System.out.println(super.);
                }
            }
        }
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public int getTotalSoldBooks() {
        return totalSoldBooks;
    }
}