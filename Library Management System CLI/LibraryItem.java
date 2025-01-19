// Abstract class representing a library item (can be a book, magazine, DVD, etc.)
public abstract class LibraryItem {
    // Properties to store item ID, title, and its borrow status
    protected String id;
    protected String title;
    protected boolean isBorrowed;

    // Constructor to initialize the library item with an ID and title
    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
        this.isBorrowed = false; // Initially, the item is not borrowed
    }

    // Getter method for item ID
    public String getId() {
        return id;
    }

    // Getter method for item title
    public String getTitle() {
        return title;
    }

    // Getter method to check if the item is borrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Method to mark the item as borrowed
    public void borrowItem() {
        isBorrowed = true;
    }

    // Method to mark the item as returned
    public void returnItem() {
        isBorrowed = false;
    }

    // Abstract method to calculate the late fee based on the number of late days
    // This must be implemented by subclasses (e.g., Book, Magazine, DVD)
    public abstract double calculateLateFee(int daysLate);
}
