package com.oops.librarysystem;

public class Book {

    private String bookName;
    private String ISBN;
    private String author;

    public Book(String bookName, String ISBN, String author)
    {
        this.bookName = bookName;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "The "+bookName+" (ISBN : "+ISBN+" ) by "+author;
    }
}
