import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {
    private List<String> songs;
    private Random random;

    public MusicLibrary() {
        songs = new ArrayList<>();
        random = new Random();
    }

    // Add a song to the library
    public void addSong(String song) {
        songs.add(song);
        System.out.println("\"" + song + "\" has been added to the music library.");
    }

    // Remove a song from the library
    public boolean removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println("\"" + song + "\" has been removed from the music library.");
            return true;
        } else {
            System.out.println("\"" + song + "\" was not found in the music library.");
            return false;
        }
    }

    // Play a random song from the library
    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs available to play.");
            return;
        }
        int index = random.nextInt(songs.size());
        String song = songs.get(index);
        System.out.println("Now playing: \"" + song + "\"");
    }

    // Main method for demonstration
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        library.addSong("Pag asa");
        library.addSong("ikaw lamang");
        library.addSong("Buwan");

        library.playRandomSong();

        library.removeSong("ikaw lamang");
        library.playRandomSong();

        library.removeSong("Budots"); // not in library
    }
}