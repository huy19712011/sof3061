package org.example.sof3061.streamApi;

import java.util.List;

public class SlicingDemo {

    public static void main(String[] args) {

        // limit(n)
        // skip(n)
        // takeWhile(predicate)
        // dropWhile(predicate)

        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        //
        movies.stream()
                .limit(2)
                .forEach(movie -> System.out.println(movie.getTitle())); // print a, b

        //
        movies.stream()
                .skip(2)
                .forEach(movie -> System.out.println(movie.getTitle())); // print c

        //
        movies.stream()
                .takeWhile(movie -> movie.getLikes() < 30)
                .forEach(movie -> System.out.println(movie.getTitle())); // print a, b

        //
        movies.stream()
                .dropWhile(movie -> movie.getLikes() < 20)
                .forEach(movie -> System.out.println(movie.getTitle())); // print b, c
    }
}
