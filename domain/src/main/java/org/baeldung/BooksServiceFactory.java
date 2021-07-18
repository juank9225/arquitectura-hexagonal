package org.baeldung;

public class BooksServiceFactory {
    public static BooksService getBooksService(BooksRepository booksRepository) {
        return new BooksServiceImpl(booksRepository);
    }
}
