import java.util.*;

public class Library {
    private ArrayList<Book> myLibrary;

    public Library() {
        this.myLibrary = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.myLibrary.add(newBook);
    }

    public void printBooks() {
        for (Book printBook : this.myLibrary) {
            System.out.println(printBook);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> booksByTitle = new ArrayList<Book>();

        for (Book printBook : this.myLibrary) {
            if(StringUtils.included(printBook.title(), title)) {
                booksByTitle.add(printBook);
            }
        }

        return booksByTitle;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> booksByPub = new ArrayList<Book>();

        for (Book printBook : this.myLibrary) {
            if(printBook.publisher().contains(publisher)) {
                booksByPub.add(printBook);
            }
        }

        return booksByPub;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> booksByYear = new ArrayList<Book>();

        for (Book printBook : this.myLibrary) {
            if(printBook.year() == year) {
                booksByYear.add(printBook);
            }
        }

        return booksByYear;
    }


}