package org.example.sof3061.streamApi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
public class MovieNew {

    private String title;
    private int likes;
    private Genre genre;

    @Override
    public String toString() {
        return "MovieNew{" +
                "title='" + title + '\'' +
                ", likes=" + likes +
                ", genre=" + genre +
                '}';
    }
}
