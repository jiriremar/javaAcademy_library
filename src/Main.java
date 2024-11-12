public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Herry Potter", "J.K Rowlingova", "9788869183157");
        Book book2 = new Book("Bod obnovy", "Michael Goest", "8595165394214");
        Book book3 = new Book("Pan prstenu", "J.R.R Tolkein", "80-7203-829-X");
        Book book4 = new Book("Ferda Mravenec", "Ondrej Sekora", " 978-80-242-6476-9");

        BookShelf bookShelf1 = new BookShelf("Past SCIFI");
        bookShelf1.addBook(book1);
        bookShelf1.addBook(book3);

        BookShelf bookShelf2 = new BookShelf("Future SCIFI");
        bookShelf2.addBook(book2);

        BookShelf bookShelf3 = new BookShelf("Kreslene pohadky");
        bookShelf3.addBook(book4);

        Section fiction = new Section("SCI-FI");
        fiction.addBookShelf(bookShelf1);
        fiction.addBookShelf(bookShelf2);

        Section pohadky = new Section("POHADKY");
        pohadky.addBookShelf(bookShelf3);

        Library library = new Library("Radostin´s Library");
        library.addSection(fiction);
        library.addSection(pohadky);

        library.infoLibrary();





    }
}