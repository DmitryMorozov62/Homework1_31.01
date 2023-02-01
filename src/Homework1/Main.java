package Homework1;

public class Main {

    public static void main(String[] args) {
        Book headFirst = new Book(new Author("Bert","Bates"),"Head First Java",2012);
        System.out.println(headFirst.getAuthorName().getFirstnameAuthor() + " " + headFirst.getAuthorName().getLastnameAuthor()+ ", " +
                headFirst.getNameBook() + ", " + headFirst.getYear());

        headFirst.setYear(2017);
        System.out.println(headFirst.getAuthorName().getFirstnameAuthor() + " " + headFirst.getAuthorName().getLastnameAuthor() + ", " +
                headFirst.getNameBook() + ", " + headFirst.getYear());


        Book thinkingInJava = new Book(new Author("Bruce","Eckel"),"thinking in java", 2015);
        System.out.println(thinkingInJava.getAuthorName().getFirstnameAuthor() + " " + thinkingInJava.getAuthorName().getLastnameAuthor() + ", " +
                thinkingInJava.getNameBook() + ", " + thinkingInJava.getYear());
    }
}