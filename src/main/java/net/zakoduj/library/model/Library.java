package net.zakoduj.library.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Library {

    private List<Book> listBook;

    public List<Book> getListBook() {
        return Collections.unmodifiableList(listBook);
    }

    public void setListBook(List<Book> listBook) {
        this.listBook = new LinkedList<>(listBook);
    }

    public void addBook(Book book) {
        if (listBook == null) {
            listBook = new LinkedList<>();
        }
        listBook.add(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(listBook, library.listBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listBook);
    }


}
