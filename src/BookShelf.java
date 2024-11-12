// rozdeleni na scifi minulost a scifi budoucnost

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private String shelfId;
    private List<Book> books;

    public BookShelf(String shelfId) {
        this.shelfId = shelfId;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void infoBookShelfs(){
        System.out.println("---------------------------");
        System.out.println("    Book Shelf ID: " + shelfId);
       for (Book book : books) {
           book.infoBook();
       }
    }
}
