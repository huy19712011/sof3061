package org.example.sof3061.streamApi;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorDemo {

    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // Collectors implement Collector
        // toList(), toSet(), ...
        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toList());

        //
        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toMap(m -> m.getTitle(), m -> m.getTitle()));

        Map<String, Integer> map = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));
        System.out.println(map);

        // advanced: some others
        IntSummaryStatistics collect = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println(collect);

        //
        String collect1 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(collect1);


    }
}
