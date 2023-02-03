package Homework1;

import java.util.Objects;

public class Author {
     private String firstname;
     private String lastname;

    public Author(String firstname,String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String getFirstnameAuthor() {
        return this.firstname;
    }
    public String getLastnameAuthor() {
        return this.lastname;
    }

    @Override
    public String toString() {
        return  firstname + " " + lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstname, author.firstname) && Objects.equals(lastname, author.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }
}
