package org.baeldung;

import java.util.UUID;

public interface BooksRepository {
    void save(Book book);
    void delete(UUID id);
}
