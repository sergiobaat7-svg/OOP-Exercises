import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String director;
    private List<String> actors;
    private List<String> reviews;

    public Movie(String title, String director, List<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>(actors);
        this.reviews = new ArrayList<>();
    }

    // Add a review
    public void addReview(String review) {
        reviews.add(review);
        System.out.println("Review added: " + review);
    }

    // Get all reviews
    public List<String> getReviews() {
        return new ArrayList<>(reviews);
    }

    // Get movie details
    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + String.join(", ", actors));
    }

    // Main method for demonstration
    public static void main(String[] args) {
        List<String> actors = new ArrayList<>();
        actors.add("Sergio");
        actors.add("Baat");

        Movie movie = new Movie("The amizing books", "Sergio Usares Ba-at", actors);

        movie.showDetails();

        movie.addReview("NICE STORY!");
        movie.addReview("GOOD MOVIE!");

        System.out.println("Reviews:");
        for (String review : movie.getReviews()) {
            System.out.println("- " + review);
        }
    }
}