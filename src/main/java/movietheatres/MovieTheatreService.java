package movietheatres;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MovieTheatreService {

    private Map<Movies, List<String>> movieAndFilms = new HashMap<>();

    public Map<Movies, List<String>> getMovieAndFilms() {
        return movieAndFilms;
    }

    public void readFromFile(){

    }
}
