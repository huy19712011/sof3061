package org.example.sof3061.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TodoDto {

    private Long id;

    @Size(min = 1, message = "Title should have at least 1 character")
    private String title;

    @Size(min = 1, message = "Description should have at least 3 characters")
    private String description;

    private boolean completed;
}
