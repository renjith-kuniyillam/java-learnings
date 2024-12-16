package Book;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(1, "Object Oriented Programming with Java", "Ranga");
        System.out.println(book);
        book.addReview(new Review(10, "Great Book", 5));
        book.addReview(new Review(101, "Awesome", 5));
    }
}
