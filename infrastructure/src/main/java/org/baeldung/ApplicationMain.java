package org.baeldung;

import org.baeldung.repositorio.BooksService;
import org.baeldung.servicio.BooksServiceFactory;

public class ApplicationMain {

    public static void main(String[] args) {
        BooksService booksService = BooksServiceFactory.getBooksService(new BooksRepositoryImpl());
        ConsoleApp consoleApp = new ConsoleApp(System.console(), booksService);
        consoleApp.waitForCommand();
    }

}