package Book;

public class Review {
    private int id;
    private String comment;
    private int rating;

    public Review(int id, String comment, int rating) {
        this.id = id;
        this.comment = comment;
        this.rating = rating;
    }

    public String toString() {
        return String.format("Review [id=%d, comment=%s, rating=%d]", id, comment, rating);
    }
}
