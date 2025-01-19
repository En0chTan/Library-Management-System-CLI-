// Book class, which extends LibraryItem
// Represents a book item in the library
public class Book extends LibraryItem {

    // Constructor to initialize a book with an ID and title
    public Book(String id, String title) {
        // Call the parent class (LibraryItem) constructor to set the ID and title
        super(id, title);
    }

    // Override the calculateLateFee method to define late fee calculation specific to books
    @Override
    public double calculateLateFee(int daysLate) {
        // Late fee for a book is $0.50 per day
        return daysLate * 0.50;
    }
}
