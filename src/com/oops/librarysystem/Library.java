package com.oops.librarysystem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class Library {
    List<Book> books;
    Set<String> bookISBN;

    public Library()
    {
        this.books = new ArrayList<>();
        this.bookISBN = new HashSet<>();
    }

    public String addBook(Book book)
    {
        if(!bookISBN.contains(book.getISBN()))
        {
            books.add(book);
            bookISBN.add(book.getISBN());
            return "Book Added : The "+book.getBookName()+" by "+book.getAuthor()+" ("+book.getISBN()+")";
        }
        return "Book Not added due to duplicate ISBN number ("+book.getISBN()+")";
    }

    public String removeBook(Book book)
    {
        if(books.contains(book))
        {
            books.remove(book);
            boolean remove = bookISBN.remove(book.getISBN());
            return "Book Removed : The "+book.getBookName()+" by "+book.getAuthor();
        }
        return "Book is not present in Library ("+book.toString()+")";
    }

    public Book findBookByISBN(String ISBN)
    {
        for(Book book : books)
        {
            if(book.getISBN().equals(ISBN))
            {
                return book;
            }
        }
        return null;
    }

    public void displayBooks()
    {
        for(Book book : books)
        {
            System.out.println(book.toString());
        }
    }
}
