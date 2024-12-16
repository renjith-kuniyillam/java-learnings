package FilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) {
        // Read from a file
        readWholeFileAtOnce();
        readFileContentAsStreams();
        writeToFile();
    }

    private static void readWholeFileAtOnce() {
        Path path = Path.of("./resource/test.txt");
        try {
           List allLines = Files.readAllLines(path);
           System.out.println(allLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFileContentAsStreams() {
        Path path = Path.of("./resource/test.txt");
        try {
            Files.lines(path).filter(l->l.startsWith("a")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile() {
        Path path = Path.of("./resource/write-to.txt");
        try {
            List<String> listToWrite = List.of("Apple", "Banana", "Elephant");
            Files.writeString(path, "Apple, banana, Mango");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
