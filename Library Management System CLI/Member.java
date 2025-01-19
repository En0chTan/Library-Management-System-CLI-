import java.util.ArrayList;
import java.util.List;

public class Member {
    // Properties to store member's ID, name, and list of borrowed items
    private String memberId;
    private String name;
    private List<LibraryItem> borrowedItems;

    // Constructor to initialize a member with a member ID and name
    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedItems = new ArrayList<>(); // Initialize borrowed items list
    }

    // Getter method for member ID
    public String getMemberId() {
        return memberId;
    }

    // Getter method for member name
    public String getName() {
        return name;
    }

    // Getter method to retrieve the list of borrowed items by the member
    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    // Method to borrow an item and add it to the list of borrowed items
    public void borrowItem(LibraryItem item) {
        borrowedItems.add(item); // Add item to the list of borrowed items
    }

    // Method to return an item and remove it from the list of borrowed items
    public void returnItem(LibraryItem item) {
        borrowedItems.remove(item); // Remove item from the list of borrowed items
    }
}
