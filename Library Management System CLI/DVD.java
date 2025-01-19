// DVD class, which extends LibraryItem
// Represents a DVD item in the library
public class DVD extends LibraryItem {

    // Constructor to initialize a DVD with an ID and title
    public DVD(String id, String title) {
        // Call the parent class (LibraryItem) constructor to set the ID and title
        super(id, title);
    }

    // Override the calculateLateFee method to define late fee calculation specific to DVDs
    @Override
    public double calculateLateFee(int daysLate) {
        // Late fee for a DVD is $1.00 per day
        return daysLate * 1.00;
    }
}
