package net.zakoduj.library;

import net.zakoduj.library.model.Book;
import net.zakoduj.library.model.BookBuilder;
import net.zakoduj.library.model.Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new BookBuilder()
                .setAuthorFirstName("Henryk")
                .setAuthorLastName("Sienkiewicz")
                .setTitle("Ogniem i mieczem")
                .build());
        library.addBook(new BookBuilder()
                .setAuthorFirstName("Carol")
                .setAuthorLastName("Lewis")
                .setTitle("Alicja w krainie czarów")
                .build());
        library.addBook(new BookBuilder()
                .setAuthorFirstName("Orhan")
                .setAuthorLastName("Pamuk")
                .setTitle("Rudowłosa")
                .build());

        for (Book book : library.getListBook()) {
            System.out.println(book);
        }


    }
}
