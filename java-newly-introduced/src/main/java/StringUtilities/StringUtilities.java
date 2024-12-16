package StringUtilities;

public class StringUtilities {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(" ".isBlank());
        System.out.println(" LR ".strip());
        System.out.println(" LR ".stripLeading().replace(" ", "@"));
        System.out.println(" LR ".stripTrailing());
        "Line1\nLine2\nLine3".lines().forEach(s->System.out.println(s));
        String subStr = "PERSON".transform(s->s.substring(2));
        System.out.println(subStr);
        System.out.println("My name is %s and my mark is %d".formatted("John", 90));
    }
}
