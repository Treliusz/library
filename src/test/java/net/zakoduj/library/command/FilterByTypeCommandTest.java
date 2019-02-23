package net.zakoduj.library.command;

import net.zakoduj.library.model.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.stubbing.Answer;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.CharBuffer;


import static org.mockito.Mockito.*;

public class FilterByTypeCommandTest {

    private InputStream inputStream;
    @Before
    public void setUp() {
        inputStream = System.in;
        System.setIn(new ByteArrayInputStream("Movie\n".getBytes()));
    }

    @After
    public void tearDown() {
        System.setIn(inputStream);

    }

    @Test
    public void shoudDisplayMoviesWhenFilterByMovie() {
        //given
        PaperBook book = new PaperBookBuilder()//
                .authorLastName("Sienkiewicz")
                .authorFirstName("Henryk")
                .title("W pustyni i w puszczy")
                .pageCount(100)
                .cover(Cover.SOFT)
                .build();
        Movie movie1 = new MovieBuilder()
                .directorFirstName("Adam")
                .directorLastName("Hoover")
                .duration(120)
                .title("No name movie")
                .build();
        Movie movie2 = new MovieBuilder()
                .directorFirstName("Hanna")
                .directorLastName("Zalewska")
                .duration(220)
                .title("Nad Potokiem")
                .build();

        Library<Medium> library = new Library<>();
        library.addMedium(book);
        library.addMedium(movie1);
        library.addMedium(movie2);
        Readable inputStreamMock = mock(Readable.class);
        PrintStream printStreamMock = mock(PrintStream.class);
        Command command = new FilterByTypeCommand(library, printStreamMock);


        //when

        command.execute();

        //then

        verify(printStreamMock, times(1)).println("Typ:" );
        verify(printStreamMock, times(1)).println(movie1);
        verify(printStreamMock, times(1)).println(movie2);
        verify(printStreamMock, never()).println(book);
    }

}