package movies;

import java.util.Arrays;
import java.util.Scanner;

import static movies.Movie.addMovie;
import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie[] movies = findAll();
        while (true) {
            System.out.println("Would you like to view all movies or by category?\n1 - View All Movies\n2 - View By Category\n3 - Add Movie\n4 - Exit Application");
            int choice = scanner.nextInt();
            if (choice == 1) {
                for (Movie movie : movies) {
                    System.out.println(movie);
                }
            }
            if (choice == 2) {
                System.out.println("Which category would you like to view?\n1 - Comedy\n2 - Horror\n3 - Drama\n4 - Musical\n5 - Sci-Fi\n6 - Animated");
                int choice2 = scanner.nextInt();
                if (choice2 == 1) {
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("comedy")) System.out.println(movie);
                    }
                }
                if (choice2 == 2) {
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("horror")) System.out.println(movie);
                    }
                }
                if (choice2 == 3) {
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("drama")) System.out.println(movie);
                    }
                }
                if (choice2 == 4) {
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("musical")) System.out.println(movie);
                    }
                }
                if (choice2 == 5) {
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("scifi")) System.out.println(movie);
                    }
                }
                if (choice2 == 6) {
                    for (Movie movie : movies) {
                        if (movie.getCategory().equalsIgnoreCase("animated")) System.out.println(movie);
                    }
                }
            }
            if (choice == 3) {
                System.out.println("Enter movie title");
                scanner.nextLine();
                String title = scanner.nextLine();
                System.out.println("Enter genre");
                String genre = scanner.next();
                movies = addMovie(movies, new Movie(title, genre));
            }
            if (choice == 4) {
                System.out.println("Thank you for using BlueBox!");
                break;
            }

        }
    }
}
