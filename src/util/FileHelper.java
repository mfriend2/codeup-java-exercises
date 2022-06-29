package util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public static List<String> slurp(String filepath) {
        try {
            return Files.readAllLines(Path.of(filepath));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

    public static void spit(String filename, List<String> fileContent, boolean append) {
        try {
            Path newFilePath = Files.createFile(Path.of(filename));
            Files.write(newFilePath, fileContent, append ? StandardOpenOption.APPEND : StandardOpenOption.TRUNCATE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void spit(String filename, List<String> fileContent) {
        spit(filename, fileContent, false);
    }

    public static void makeExciting(String filepath) {
        try {
            List<String> lines = Files.readAllLines(Path.of(filepath));
            List<String> newLines = new ArrayList<>();
            for (String line : lines) {
                newLines.add(String.format("%s!\n", line.toUpperCase()));
            }
            Files.write(Path.of(filepath), newLines);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        ArrayList fileStuff = new ArrayList<>();
        fileStuff.add("Something");
        fileStuff.add("Something Else");
        spit("myfile.txt", fileStuff);
        makeExciting("myfile.txt");
    }
}
