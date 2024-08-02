package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogBook {
    private List<Book> bookList;

    public CatalogBook() {
        this.bookList = new ArrayList<>();
    }

    public void createbook(String title, String autor, int yearPublication) {
        bookList.add(new Book(title, autor, yearPublication));
    }

    public List<Book> searchFilterAutor(String autor) {
        List<Book> booksAutor = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book l : bookList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    booksAutor.add(l);
                }
            }
        }
        return booksAutor;
    }

    public List<Book> searchFilterIntervalYears(int firstYear, int finalYear) {
        List<Book> booksIntervalYears = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book l : bookList) {
                if (l.getYearPublication() >= firstYear && l.getYearPublication() <= finalYear) {
                    booksIntervalYears.add(l);
                }
            }
        }
        return booksIntervalYears;
    }

    public Book searchFilterTitle(String title) {
        Book bookFilterTitle = null;

        if (!bookList.isEmpty()) {
            for (Book l : bookList) {
                if (l.getTitle().equalsIgnoreCase(title)) {
                    bookFilterTitle = l;
                    break;
                }
            }
        }
        return bookFilterTitle;
    }

    public static void main(String[] args) {
        CatalogBook catalogBook = new CatalogBook();

        catalogBook.createbook("Livro 1", "Autor 1", 2020);
        catalogBook.createbook("Livro 1", "Autor 1", 2018);
        catalogBook.createbook("Livro 2", "Autor 2", 2019);
        catalogBook.createbook("Livro 3", "Autor 3", 2014);
        catalogBook.createbook("Livro 4", "Autor 4", 2020);
        catalogBook.createbook("Livro 1", "Autor 1", 2024);
        catalogBook.createbook("Livro 5", "Autor 6", 1987);

        System.out.println(catalogBook.searchFilterAutor("Autor 6"));
        System.out.println(catalogBook.searchFilterIntervalYears(2020, 2024));
        System.out.println(catalogBook.searchFilterTitle("Livro 1"));
    }
}
