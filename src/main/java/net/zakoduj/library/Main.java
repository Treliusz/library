package net.zakoduj.library;

import net.zakoduj.library.command.Command;
import net.zakoduj.library.command.DisplayMultimediaCommand;
import net.zakoduj.library.command.FilterByTypeCommand;
import net.zakoduj.library.model.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library<Medium> library = createLibrary();
        Map<String, Command> commands = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        commands.put("exit", () -> System.exit(0));
        commands.put("display", new DisplayMultimediaCommand(library,System.out));
        commands.put("filter", new FilterByTypeCommand(library, System.out));

        while (true) {
            System.out.println("Podaj komendę:");
            String commandName = scanner.nextLine();
            Command command = commands.get(commandName);
            Optional.ofNullable(command).ifPresent(Command::execute);
        }


    }

    private static Library<Medium> createLibrary() {
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
        return library;
    }
}
