package task.T16;

import java.util.Arrays;

public class Library {
    static private Reader[] readers = {};


    public void addReader(Reader name) {
        readers = Arrays.copyOf(readers, readers.length + 1);
        readers[readers.length - 1] = name;
    }

    public void delReaderCard(Reader name) throws Exception {
        for (int i = 0; i < readers.length; i++) {
            if (name.equals(readers[i])) {
                for (int j = i + 1; j < readers.length; j++) {
                    readers[j - 1] = readers[j];

                }
                readers = Arrays.copyOf(readers, readers.length - 1);
                break;

            } else if (i == readers.length - 1) {
                throw new Exception("Такого читача не існує");
            }
        }
    }

        public void displayReader() {
            for (int i = 0; i < readers.length; i++) {
                System.out.println("Reader name:" + readers[i].getName());
                System.out.println("Borrow books:");
                for (int j = 0; j < readers[i].getBorrowedBooks().length; j++) {
                    System.out.println(readers[i].getBorrowedBooks()[j]);
                }
                System.out.println("Return books:");
                for (int j = 0; j < readers[i].getReturnedBooks().length; j++) {
                    System.out.println(readers[i].getReturnedBooks()[j]);
                }
            }

        }


    }


