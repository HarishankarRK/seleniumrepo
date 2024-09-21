package week1;

public class Librarymanagement {
	
	public static void main(String[] args) {
        // Create an instance of Library
        Library library = new Library();
        
        // Call the addBook method
        String addedBook = library.addBook("1984");
        System.out.println("Added Book: " + addedBook);
        
        // Call the issueBook method
        library.issueBook();
    }

}
