package task.T16;

import java.util.Arrays;

public class Reader {
    private String name;

    private String[] borrowedBooks = {};
    private String[] returnedBooks = {};

    public Reader(String name) {
        this.name = name;
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
        for (int j = index+1; j < borrowedBooks.length; j++) {
            borrowedBooks[j-1] = borrowedBooks[j];
        }
        borrowedBooks = Arrays.copyOf(borrowedBooks, borrowedBooks.length -1);

        returnedBooks = Arrays.copyOf(returnedBooks, returnedBooks.length +1);
        returnedBooks[returnedBooks.length-1] = book;
    }

    public String getName() {
        return name;
    }

    public String[] getBorrowedBooks() {
        return borrowedBooks.clone();
    }

    public String[] getReturnedBooks() {
        return returnedBooks.clone();
    }




}
