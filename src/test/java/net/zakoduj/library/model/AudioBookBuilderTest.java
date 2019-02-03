package net.zakoduj.library.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class AudioBookBuilderTest {

    @Test
    public void shouldBuildAudioBookWhenBookDetailsAreDefined() {
        //given
        String authorFirstName = "Jan";
        String authorLastName = "Nowak";
        String title = "Rudowlosa";
        Format format = Format.WAV;
        //when
        AudioBook book = new AudioBookBuilder()
                .authorFirstName(authorFirstName)
                .authorLastName(authorLastName)
                .format(Format.WAV)
                .title(title)
                .build();
        // then
        assertNotNull(book);
        assertNotNull(book.getAuthor());
        assertEquals(authorFirstName, book.getAuthor().getFirstName());
        assertEquals(authorLastName, book.getAuthor().getLastName());
        assertEquals(title, book.getTitle());
        assertEquals(format, book.getFormat());

    }



}