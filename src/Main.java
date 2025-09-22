import com.oops.librarysystem.Book;
import com.oops.librarysystem.Library;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        display();
        while(isTrue)
        {
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter Book Name : ");
                    String bookName = sc.nextLine();
                    System.out.println("Enter ISBN Number : ");
                    String ISBN = sc.nextLine();
                    System.out.println("Enter Author Name : ");
                    String author = sc.nextLine();

                    Book book = new Book(bookName, ISBN, author);

                    System.out.println(lib.addBook(book));
                    break;
                case 2 :
                    System.out.println("Enter ISBN Number : ");
                    String ISBNToFind = sc.nextLine();
                    Book bookToRemove = lib.findBookByISBN(ISBNToFind);

                    if(bookToRemove != null)
                    {
                        System.out.println(lib.removeBook(bookToRemove));
                        break;
                    }
                    System.out.println("Book Not Found");
                    break;
                case 3 :
                    System.out.println("ALL BOOKS IN LIBRARY");
                    lib.displayBooks();
                    break;
                case 4 :
                    display();
                    break;
                case 5 :
                    isTrue = false;
                    break;
                default :
                    System.out.println("Enter the correct option");
                    break;

            }
        }

    }

    public static void display()
    {
        System.out.println("Select the Options from Below : ");
        System.out.println("1. Add book\n2. Remove Book\n3. Display List of Books\n4. Display all options\n5. Leave from Library");
    }
}