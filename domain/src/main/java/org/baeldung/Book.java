package org.baeldung;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Book {
    private UUID id;
    private String title;
    private String author;
    private String description;
}
