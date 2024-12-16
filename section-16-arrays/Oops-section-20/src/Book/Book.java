package Book;

public class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void addReview(Review review) {
        System.out.println("Review added: " + review);
    }

    public String toString() {
        return String.format("Book [id=%d, title=%s, author=%s]", id, title, author);
    }

}
