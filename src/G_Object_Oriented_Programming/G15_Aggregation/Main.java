/*
 * Description:
 * This program demonstrates the concept of Aggregation in Object-Oriented Programming.
 * A Library "has-a" relationship with Book objects, meaning a Library contains Books, but the Book objects can exist independently of the Library.

 * The program:
 * - Creates multiple Book objects
 * - Stores them in a Library object
 * - Displays library details along with available books

 * Key OOP Concept Used:
 * Aggregation (Has-A Relationship)
 */


package G_Object_Oriented_Programming.G15_Aggregation;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public Library",1897, books);
        library.displayLibraryInfo();

    }
}

// Aggregation = Represents a "has-a" relationship between objects.
// One object contains another object as part of its structure, but the contained object/s can exist independently.

/* Concept: Aggregation

Definition:
Aggregation is a special form of association that represents a “has-a” relationship, where one class contains references to other classes,
but the contained objects can exist independently of the container.

Example Explanation

Book class:
Represents an independent entity that can exist without the library.

Book book1 = new Book("The Fellowship of the Ring", 423);

Library class:
Has a collection (array) of Book objects — hence, Library has Books.

Book[] books = {book1, book2, book3};
Library library = new Library("NYC Public Library", 1897, books);

Independence:
Even if the Library object is destroyed, the Book objects still exist in memory — this is aggregation, not composition.*/