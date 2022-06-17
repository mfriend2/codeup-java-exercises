package movies;

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
}
