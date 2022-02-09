package taller3.domain;

import javax.xml.crypto.Data;
import java.util.Objects;

public class song {
    private final Integer id;
    private String title;
    private Data date;
    private musicalGenre genre;
    private String coverPage;
    private String description;

    public song(Integer id, String title, Data date, musicalGenre genre, String coverPage, String description) {
        this.id = Objects.requireNonNull(id);
        this.title = Objects.requireNonNull(title);
        this.date = Objects.requireNonNull(date);
        this.genre = Objects.requireNonNull(genre);
        this.coverPage = Objects.requireNonNull(coverPage);
        this.description = Objects.requireNonNull(description);
        if(id < 0){
            throw new IllegalArgumentException("Identifiers cannot be negative.");
        }
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Data getDate() {
        return date;
    }


    public musicalGenre getGenre() {
        return genre;
    }

    public String getCoverPage() {
        return coverPage;
    }


    public String getDescription() {
        return description;
    }

    public enum musicalGenre {
        ROCK, REGGAETON, POP, TROPICAL, ELECTRONIC, RAP, CLASIC, SALSA, TRAP, REGGAE
    }
}
