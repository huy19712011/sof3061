package org.example.sof3061.streamApi;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingDemo {

    public static void main(String[] args) {

        List<MovieNew> movies = List.of(
                new MovieNew("a", 10, Genre.THRILLER),
                new MovieNew("b", 20, Genre.ACTION),
                new MovieNew("c", 30, Genre.ACTION)
        );


        //
        Map<Genre, List<MovieNew>> collect = movies.stream()
                .collect(Collectors.groupingBy(MovieNew::getGenre));
        System.out.println(collect);

        //
        Map<Genre, Long> collect1 = movies.stream()
                .collect(Collectors.groupingBy(MovieNew::getGenre, Collectors.counting()));
        System.out.println(collect1);

        //
        Map<Genre, String> collect2 = movies.stream()
                .collect(Collectors.groupingBy(
                        MovieNew::getGenre,
                        Collectors.mapping(MovieNew::getTitle, Collectors.joining(", "))));
        System.out.println(collect2);
    }
}
