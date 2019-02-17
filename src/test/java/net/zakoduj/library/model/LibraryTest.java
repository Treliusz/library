package net.zakoduj.library.model;


import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void shouldAddBookWhenListOfBooksExist() {
        // given
        Library library = new Library();
        library.setMedia(new LinkedList<Book>());
        Book book = new AudioBook();
        book.setTitle("W pustyni i w puszczy");
        // when
        library.addMedium(book);

        // then
        assertEquals(Arrays.asList(book), library.getMedia());
    }
    @Test
    public void shouldAddBookWhenListOfBooksDoesNotExist() {
        // given
        Library library = new Library();
        Book book = new AudioBook();
        book.setTitle("W pustyni i w puszczy");
        // when
        library.addMedium(book);

        // then
        assertEquals(Arrays.asList(book), library.getMedia());
    }

}