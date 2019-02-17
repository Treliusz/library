package net.zakoduj.library;

import net.zakoduj.library.model.*;

public class Main {
    public static void main(String[] args) {

        Library<Medium> library = new Library<>();
        Library<AudioBook> library2 = new Library<>();


        library.addMedium(new PaperBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("Ogniem i mieczem")
                .pageCount(345)
                .build());
        library.addMedium(new PaperBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("Ogniem i mieczem")
                .cover(Cover.SOFT)
                .build());

        library.addMedium(new PaperBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("Ogniem i mieczem")
                .cover(Cover.SOFT)
                .build());
        library.addMedium(new AudioBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("Ogniem i mieczem")
                .format(Format.WAV)
                .build());
        library.addMedium(new AudioBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("Ogniem i mieczem")
                .format(Format.WAV)
                .build());
        library.addMedium(new AudioBookBuilder()
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .title("Ogniem i mieczem")
                .format(Format.WAV)
                .build());
        library.addMedium(new MagazineBuilder()
                .number(23)
                .title("Programista")
                .pageCount(100)
                .build());
        library.addMedium(new MovieBuilder()
                .title("Przeminęło z wiatrem")
                .directorFirstName("Henry")
                .directorLastName("Smith")
                .duration(120)
                .build());


//        for (Medium medium : library.getMedia()) {
//            System.out.println(medium);
//        }


        library.getMedia().forEach(System.out::println);

        System.out.println("\n----------------------------\n");
//        for (Book book : library2.getMedia()) {
//            System.out.println(book);
//        }


    }
}
