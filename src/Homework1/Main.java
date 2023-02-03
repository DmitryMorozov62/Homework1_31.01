package Homework1;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Author headFirst1 = new Author("Bert", "Bates");
        Author headFirst2 = new Author("Bert", "Bates");

        Book headFirst = new Book(new Author("Bert", "Bates"), "Head First Java", 2012);
        Book thinkingInJava = new Book(new Author("Bruce", "Eckel"), "thinking in java", 2015);

        System.out.println(new Author("Bert", "Bates"));
        System.out.println(new Book(new Author("Bert", "Bates"), "Head First Java", 2012));
        System.out.println(new Author("Bruce", "Eckel"));
        System.out.println(new Book(new Author("Bruce", "Eckel"), "thinking in java", 2015));
        System.out.println(headFirst.equals(thinkingInJava));
        System.out.println(headFirst1.equals(headFirst2));

    }
}