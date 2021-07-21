package org.baeldung.repositorio;

import org.baeldung.datos.Book;

import java.util.UUID;

public interface BooksRepository {
    void save(Book book);
    void delete(UUID id);
}
