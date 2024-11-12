public class Main {
    public static void main(String[] args) {

        Book harryPotter = new Book("Harry Potter", "J.K Rowlingova", "9788869183157");
        Book bodObnovy = new Book("Bod obnovy", "Michael Goest", "8595165394214");
        Book panPrstenu = new Book("Pan prstenu", "J.R.R Tolkein", "80-7203-829-X");
        Book ferdaMravenec = new Book("Ferda Mravenec", "Ondrej Sekora", " 978-80-242-6476-9");

        BookShelf scifiPastTime = new BookShelf("Past SCIFI");
        scifiPastTime.addBook(harryPotter);
        scifiPastTime.addBook(panPrstenu);

        BookShelf scifiFutureTime = new BookShelf("Future SCIFI");
        scifiFutureTime.addBook(bodObnovy);

        BookShelf pohadkyKreslene = new BookShelf("Kreslene pohadky");
        pohadkyKreslene.addBook(ferdaMravenec);

        Section scifi = new Section("SCI-FI");
        scifi.addBookShelf(scifiPastTime);
        scifi.addBookShelf(scifiFutureTime);

        Section pohadky = new Section("POHADKY");
        pohadky.addBookShelf(pohadkyKreslene);

        Library library = new Library("Radostin´s Library");
        library.addSection(scifi);
        library.addSection(pohadky);

        library.infoLibrary();





    }
}