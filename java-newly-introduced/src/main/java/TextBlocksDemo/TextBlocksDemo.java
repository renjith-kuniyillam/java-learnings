package TextBlocksDemo;

public class TextBlocksDemo {
    public static void main(String[] args) {
        String html = """
                first name :  %s 
                last name  :  %s
                phone no   :  %s
                email      :  %s
                """.formatted("John", "Doe", "1234567890", "john.doe@gmail.com");
        System.out.println(html);
    }
}
