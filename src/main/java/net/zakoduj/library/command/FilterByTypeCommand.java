package net.zakoduj.library.command;


import net.zakoduj.library.model.Library;
import net.zakoduj.library.model.Medium;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FilterByTypeCommand implements Command {

    private final Library<Medium> library;
    private final PrintStream printStream;


    public FilterByTypeCommand(Library<Medium> library, PrintStream printStream) {
        this.library = library;
        this.printStream = printStream;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        printStream.println("Typ:");
        String typ = scanner.nextLine();
//        for (Medium medium : library.getMedia()) {
//            if (medium.getClass().getSimpleName().equals(typ)) {
//                printStream.println(medium);
//            }
//        }
        library.getMedia().stream()
                .filter(medium -> medium.getType().equals(typ))
                .forEach(printStream::println);

    }
}
