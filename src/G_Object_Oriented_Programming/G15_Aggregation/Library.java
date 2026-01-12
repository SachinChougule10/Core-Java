package G_Object_Oriented_Programming.G15_Aggregation;

public class Library {
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayLibraryInfo(){
        System.out.println("The " + this.year +" " + this.name);
        System.out.println("\nBooks available in this library are: \n");
        for(Book book : books){
            System.out.println(book.displayBookInfo());
        }
    }
}

// Aggregation :- Our Library objects have books objects in it
// with aggregation if you were to delete this Library class, these books objects can exist independently outside the library,
// the books aren't built into the library so they can exist independently