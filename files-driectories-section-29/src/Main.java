import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Files.list(Path.of("./src")).forEach(System.out::println);
        System.out.println("Files.walk");
        Files.walk(Path.of("."), 3).filter(z->String.valueOf(z).contains("java")).forEach(System.out::println);
        System.out.println("Files.find");
        Files.find(Path.of("."), 3, (path, basicFileAttributes) -> String.valueOf(path).contains("java")).forEach(System.out::println);
    }


}