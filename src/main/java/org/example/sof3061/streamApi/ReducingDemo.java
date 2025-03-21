package org.example.sof3061.streamApi;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReducingDemo {

    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        //
        movies.stream()
                .count(); // 3

        //
        movies.stream()
                .anyMatch(movie -> movie.getLikes() > 20); // true

        //
        movies.stream()
                .allMatch(movie -> movie.getLikes() > 20); // false

        //
        movies.stream()
                .noneMatch(movie -> movie.getLikes() > 20); // false

        // min, max
        Movie m = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println(m);

        // Complex
        //
        // [10, 20, 30]
        // [30, 30]
        // [60]
        Optional<Integer> sum = movies.stream()
                .map(movie -> movie.getLikes())
                .reduce((a, b) -> a + b);

        System.out.println(sum.orElse(0)); // 60

        // method reference with other version of reduce(...)
        Integer sum2 = movies.stream()
                .map(movie -> movie.getLikes())
                .reduce(0, Integer::sum);


    }
}
