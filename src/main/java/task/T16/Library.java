package task.T16;

import java.util.Arrays;

public class Library {
    private String[] readerCard = {};
    // static

    private Reader[] readers = {};

    public void displayFullInfo() {
        for (Reader reader : readers) {
            System.out.println(reader.getName());
            System.out.println(Arrays.toString(reader.getBorrowedBooks()));
            System.out.println(Arrays.toString(reader.getReturnedBooks()));
        }
    }

    public void addReader(String name) {
        readerCard = Arrays.copyOf(readerCard, readerCard.length + 1);
        readerCard[readerCard.length - 1] = name;
    }

    public void displayReader() {
        for (int i = 0; i < readerCard.length; i++) {
            System.out.println("Reader: " + readerCard[i]);

        }
    }

    public static class ReaderCard {
        private String readerName;
        private String[] borrowedBooks = {};
        private String[] returnedBooks = {};


        public ReaderCard(String readerName) {
            this.readerName = readerName;
        }

        public void borrowBook(String book) {
            borrowedBooks = Arrays.copyOf(borrowedBooks, borrowedBooks.length + 1);
            borrowedBooks[borrowedBooks.length - 1] = book;
        }

        public void returnBook(String book) {
            int index = 1;
            for (int i = 0; i < borrowedBooks.length; i++) {
                if (book.equals(borrowedBooks[i])) {
                    index = i;
                }
            }
            for (int j = index + 1; j < borrowedBooks.length; j++) {
                borrowedBooks[j - 1] = borrowedBooks[j];
            }
            borrowedBooks = Arrays.copyOf(borrowedBooks, borrowedBooks.length - 1);

            returnedBooks = Arrays.copyOf(returnedBooks, returnedBooks.length + 1);
            returnedBooks[returnedBooks.length - 1] = book;
        }


        public void displayReaderCard() {
            System.out.println("Reader " + readerName + ":");
            System.out.println("Borrowed:");
            for (int i = 0; i < borrowedBooks.length; i++) {
                System.out.println(" - " + borrowedBooks[i]);
            }
            System.out.println("Returted:");
            for (int i = 0; i < returnedBooks.length; i++) {
                System.out.println(" - " + returnedBooks[i]);
            }
        }


    }
}
