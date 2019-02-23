package net.zakoduj.library.command;

import net.zakoduj.library.model.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class DisplayMultimediaCommandTest {

    @Test
    public void shouldDisplayMulimediaWhenSomeMulimediaIsAvailable() {
        //given
        PaperBook book = new PaperBookBuilder()//
                .authorLastName("Sienkiewicz")
                .authorFirstName("Henryk")
                .title("W pustyni i w puszczy")
                .pageCount(100)
                .cover(Cover.SOFT)
                .build();
        Movie movie = new MovieBuilder()
                .directorFirstName("Adam")
                .directorLastName("Hoover")
                .duration(120)
                .title("No name movie")
                .build();

        Library<Medium> library = new Library<>();
        library.addMedium(book);
        library.addMedium(movie);
        PrintStream printStreamMock = mock(PrintStream.class);

        Command command = new DisplayMultimediaCommand(library, printStreamMock);

        //when

        command.execute();

        //then

        verify(printStreamMock, times(1))
                .println(book);
        verify(printStreamMock, times(1))
                .println(movie);

    }

}