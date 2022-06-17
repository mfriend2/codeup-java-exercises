package movies;

import java.util.Arrays;

public class Movie {
    private String name;
    private String category;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - " + category + "\n";
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static Movie[] addMovie(Movie[] arr, Movie newMovie) {
        Movie[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = newMovie;
        return newArr;
    }
}
