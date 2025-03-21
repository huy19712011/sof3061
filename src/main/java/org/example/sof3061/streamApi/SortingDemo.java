package org.example.sof3061.streamApi;

import java.util.Comparator;
import java.util.List;

public class SortingDemo {

    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("b", 10),
                new Movie("a", 20),
                new Movie("c", 30)
        );

        // 1.
        movies.stream()
                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                .forEach(movie -> System.out.println(movie.getTitle()));

        // 2.
        movies.stream()
                .sorted(Comparator.comparing(movie -> movie.getTitle()))
                .forEach(movie -> System.out.println(movie.getTitle()));

        // 2a. Method reference
        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(movie -> System.out.println(movie.getTitle()));

    }


}
