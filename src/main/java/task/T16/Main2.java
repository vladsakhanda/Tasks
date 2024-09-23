package task.T16;

public class Main2 {
    public static void main(String[] args) throws Exception {
        Library library = new Library();

        Reader reader1 = new Reader("Josh");
        Reader reader2 = new Reader("Jon");


        library.addReader(reader1);
        library.addReader(reader2);
        reader1.borrowBook("sswswww");
        reader1.borrowBook("ss");
        reader1.returnBook("ss");
        reader2.borrowBook("sswswww");
        reader2.borrowBook("ss");
        reader2.returnBook("ss");
        library.delReaderCard(reader1);
        library.displayReader();

    }
}
