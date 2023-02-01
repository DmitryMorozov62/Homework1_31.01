package Homework1;

public class Book {
     Author author;
     String nameBook;
     int year;

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
}
