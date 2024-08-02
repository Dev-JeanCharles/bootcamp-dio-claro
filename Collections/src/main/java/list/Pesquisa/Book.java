package main.java.list.Pesquisa;

public class Book {
    private String title;
    private String autor;
    private int yearPublication;

    public Book(String title, String autor, int yearPublication) {
        this.title = title;
        this.autor = autor;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", yearPublication=" + yearPublication +
                '}';
    }
}
