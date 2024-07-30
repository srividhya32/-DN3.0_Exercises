package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<Book> books;
    private boolean isSorted;

    public Library() {
        books = new ArrayList<>();
        isSorted = false;
    }

    public void addBook(Book book) {
        books.add(book);
        isSorted = false; 
    }

    public void sortBooks() {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
        isSorted = true;
    }

    public Book findBookByTitle(String title) {
        if (isSorted) {
            return findBookByTitleBinary(title);
        } else {
            return findBookByTitleLinear(title);
        }
    }

    private Book findBookByTitleLinear(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    private Book findBookByTitleBinary(String title) {
        int low = 0;
        int high = books.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Book midBook = books.get(mid);
            int comparison = midBook.getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
    public boolean isSorted() {
        return isSorted;
    }

}
