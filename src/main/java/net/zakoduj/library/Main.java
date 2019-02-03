package net.zakoduj.library;

import net.zakoduj.library.model.*;

public class Main {
    public static void main(String[] args) {

        Library<PaperBook> library = new Library<>();
        Library<AudioBook> library2 = new Library<>();

        library.addBook(new PaperBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("Ogniem i mieczem")
                .build());
        library.addBook(new PaperBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("Ogniem i mieczem")
                .cover(Cover.SOFT)
                .build());

        library.addBook(new PaperBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("Ogniem i mieczem")
                .cover(Cover.SOFT)
                .build());
        library2.addBook(new AudioBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("Ogniem i mieczem")
                .format(Format.WAV)
                .build());
        library2.addBook(new AudioBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("Ogniem i mieczem")
                .format(Format.WAV)
                .build());
        library2.addBook(new AudioBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("Ogniem i mieczem")
                .format(Format.WAV)
                .build());


        for (Book book : library.getListBook()) {
            System.out.println(book);
        }
        System.out.println("\n----------------------------\n");
        for (Book book : library2.getListBook()) {
            System.out.println(book);
        }


    }
}
