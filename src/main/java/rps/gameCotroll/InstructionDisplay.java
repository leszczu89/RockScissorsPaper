package rps.gameCotroll;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.Objects;
import java.util.stream.Stream;

public class InstructionDisplay {
    public static void displayInstruction(String fileName){
        ClassLoader classLoader = InstructionDisplay.class.getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource(fileName)).getFile().replace("%20", " "));

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
