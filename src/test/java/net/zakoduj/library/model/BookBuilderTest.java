package net.zakoduj.library.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookBuilderTest {

    @Test
    public void shouldBuildBookWhenBookDetailsAreDefined() {
        //given
        String authorFirstName = "Jan";
        String authorLastName = "Nowak";
        String title = "Rudowlosa";
        //when
        Book book = new BookBuilder().setAuthorFirstName(authorFirstName)
                .setAuthorLastName(authorLastName)
                .setTitle(title)
                .build();
        // then
        assertNotNull(book);
        assertNotNull(book.getAuthor());
        assertEquals(authorFirstName, book.getAuthor().getFirstName());
        assertEquals(authorLastName, book.getAuthor().getLastName());
        assertEquals(title, book.getTitle());
    }

}