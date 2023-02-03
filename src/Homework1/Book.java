package Homework1;

import java.util.Objects;

public class Book {
     private Author author;
     private String nameBook;
     private int year;

    public Book(Author author, String nameBook, int year) {
        this.author = author;
        this.nameBook = nameBook;
        this.year = year;
    }
    public Author getAuthorName() {
        return this.author;
    }

    public String getNameBook() {
        return this.nameBook;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  author + " " + nameBook + " " +year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameBook, year);
    }

}
