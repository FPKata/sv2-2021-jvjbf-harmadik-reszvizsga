package movietheatres;

import java.time.LocalTime;
import java.util.Objects;

public class Movies {
    private String title;
    private LocalTime startTime;

    public LocalTime getStartTime() {
        return startTime;
    }

    public Movies(String name, LocalTime startTime) {
        this.title = name;
        this.startTime = startTime;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movies movies = (Movies) o;
        return Objects.equals(title, movies.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
