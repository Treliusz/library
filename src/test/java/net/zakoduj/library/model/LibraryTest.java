package net.zakoduj.library.model;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void shouldAddBookWhenListOfBooksExist() {
        // given
        Library library = new Library();
        library.setListBook(new LinkedList<Book>());
        Book book = new Book();
        book.setTitle("W pustyni i w puszczy");
        // when
        library.addBook(book);

        // then
        assertEquals(Arrays.asList(book), library.getListBook());
    }
    @Test
    public void shouldAddBookWhenListOfBooksDoesNotExist() {
        // given
        Library library = new Library();
        Book book = new Book();
        book.setTitle("W pustyni i w puszczy");
        // when
        library.addBook(book);

        // then
        assertEquals(Arrays.asList(book), library.getListBook());
    }

}