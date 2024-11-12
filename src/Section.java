import java.util.ArrayList;
import java.util.List;

public class Section {
    private String sectionName;
    private List<BookShelf> bookShelfList;

    public Section(String sectionName) {
        this.sectionName = sectionName;
        this.bookShelfList = new ArrayList<>();
    }

    public void addBookShelf(BookShelf bookShelf) {
        bookShelfList.add(bookShelf);
    }

    public void infoSection() {
        System.out.println("\n======================================================");
        System.out.println("∆ Name: " + this.sectionName);
        for (BookShelf bookShelf : bookShelfList) {
            bookShelf.infoBookShelfs();
        }
    }
}
