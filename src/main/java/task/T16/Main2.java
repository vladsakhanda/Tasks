package task.T16;

public class Main2 {
    public static void main(String[] args) throws Exception {
        Library library = new Library();

        Library.ReaderCard reader1 = new Library.ReaderCard("Josh");
        Library.ReaderCard reader2 = new Library.ReaderCard("Jung");


        reader1.borrowBook("B1");
        reader1.borrowBook("B2");
        reader1.returnBook("B1");

        reader2.borrowBook("B1");
        reader2.borrowBook("B2");
        reader2.returnBook("B1");

        library.addReader("Josh");
        library.addReader("Jung");

        library.delReaderCard("Josh");




        library.displayReader();





    }
}
