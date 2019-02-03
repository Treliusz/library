package net.zakoduj.library.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaperBookBuilderTest {

    @Test
    public void shouldBuildPaperBookWhenBookDetailsAreDefined() {
        //given
        String authorFirstName = "Jan";
        String authorLastName = "Nowak";
        String title = "Rudowlosa";
        Cover cover = Cover.HARD;
        //when
        PaperBook book = new PaperBookBuilder()
                .authorFirstName(authorFirstName)
                .authorLastName(authorLastName)
                .cover(Cover.HARD)
                .title(title)
                .build();
        // then
        assertNotNull(book);
        assertNotNull(book.getAuthor());
        assertEquals(authorFirstName, book.getAuthor().getFirstName());
        assertEquals(authorLastName, book.getAuthor().getLastName());
        assertEquals(title, book.getTitle());
        assertEquals(cover, book.getCover());

    }

}