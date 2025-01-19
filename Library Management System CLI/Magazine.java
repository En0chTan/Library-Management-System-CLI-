// Magazine class, which extends LibraryItem
// Represents a magazine item in the library
public class Magazine extends LibraryItem {

    // Constructor to initialize a magazine with an ID and title
    public Magazine(String id, String title) {
        // Call the parent class (LibraryItem) constructor to set the ID and title
        super(id, title);
    }

    // Override the calculateLateFee method to define late fee calculation specific to magazines
    @Override
    public double calculateLateFee(int daysLate) {
        // Late fee for a magazine is $0.25 per day
        return daysLate * 0.25;
    }
}
