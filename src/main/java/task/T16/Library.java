package task.T16;

import java.util.Arrays;

public class Library {
    private String[] readerCard = {};

    public void addReader(String name) {
        readerCard = Arrays.copyOf(readerCard, readerCard.length +1);
        readerCard[readerCard.length - 1] = name;
    }

    public void delReaderCard(String name) throws Exception {
        // Зробити нормально
        boolean value = false;
        for (int i = 0; i < readerCard.length; i++) {
            if (name.equals(readerCard[i])) {
                value = true;

            }
        }
        System.out.println(value);
        if (value == true) {
            int index = 1;
            for (int i = 0; i < readerCard.length; i++) {
                if (name.equals(readerCard[i])) {
                    index = i;

                }
            }

            for (int j = index+1; j < readerCard.length; j++) {
                readerCard[j-1] = readerCard[j];

            }

            readerCard = Arrays.copyOf(readerCard, readerCard.length -1);
        } else {
            throw new Exception("Такої людини не існує");
        }


    }


 // Зробити метод delReader, displayReader вивід книжок




    public void displayReader(ReaderCard ... readers) {
            for (int i = 0; i < readers.length; i++) {
                readers[i].displayReaderCard();
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
            // Зробити нормально
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
