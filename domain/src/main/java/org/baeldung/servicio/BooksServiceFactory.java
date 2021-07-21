package org.baeldung.servicio;

import org.baeldung.repositorio.BooksRepository;
import org.baeldung.repositorio.BooksService;

public class BooksServiceFactory {
    public static BooksService getBooksService(BooksRepository booksRepository) {
        return new BooksServiceImpl(booksRepository);
    }
}
