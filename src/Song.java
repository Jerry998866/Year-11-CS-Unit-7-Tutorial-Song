import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class Song {

    private String title;
    private String artist;

    private ArrayList<String> names = new ArrayList<>();

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String> arrayNames) {
        int count = 0;
        for (int i = 0; i < arrayNames.size(); i++) {
            String element = arrayNames.get(i);
            String elementUpperCase = element.toUpperCase();
            arrayNames.set(i, elementUpperCase);
        }
        for (int i = 0; i < arrayNames.size(); i++) {
            if (!names.contains(arrayNames.get(i))) {
                count += 1;
            }
            names.add(arrayNames.get(i));
        }
        return count;
    }
}