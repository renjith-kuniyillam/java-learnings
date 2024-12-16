package FileRunnerMethods;

import com.sun.tools.jconsole.JConsoleContext;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("./src/main/resources/file.txt");
        String content = Files.readString(path);
        System.out.println(content);

        String updatedContent = content.replace("List", "Updated List" );

        Path newFile = Path.of("./src/main/resources/updatedFile.txt");
        Files.writeString(newFile, updatedContent);


    }
}
