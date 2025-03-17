package org.example.sof3061.streamApi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MappingDemo {

    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        movies.stream()
                .map(movie -> movie.getTitle())
                .forEach(t -> System.out.println(t));

        movies.stream()
                .mapToInt(movie -> movie.getLikes())
                .forEach(likes -> System.out.println(likes));

        movies.stream()
                .forEach(movie -> System.out.println(movie.getTitle() + ": " + movie.getLikes()));

        Map<String, Integer> movieMap = movies.stream()
                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));

        movieMap.forEach((title, likes) -> System.out.println(title + " - " + likes));

        // flatMap
        Stream<List<Integer>> stream1 = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream1.forEach(list -> System.out.println(list));

        Stream<List<Integer>> stream2 = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream2.flatMap(list -> list.stream())
                .forEach(integer -> System.out.println(integer));


    }
}
