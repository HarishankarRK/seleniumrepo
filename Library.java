package week1;

public class Library {
	public String addBook(String bookTitle) {
        System.out.println("Book added successfully");
        return bookTitle;
    }

    // Method to issue a book
    public void issueBook() {
        System.out.println("Book issued successfully");
    }

    // Main method to create an object of Library class and call its methods
    public static void main(String[] args) {
        Library library = new Library();
        
        String addedBook = library.addBook("The Great Gatsby");
        System.out.println("Added Book: " + addedBook);
        
        library.issueBook();
    }
}


