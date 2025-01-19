// Librarian class responsible for approving or denying borrow requests
public class Librarian {

    // Method to approve or deny a borrow request
    // Returns true if the request is approved, false otherwise
    public boolean approveBorrowRequest(Member member, LibraryItem item) {
        // Check if the item is not currently borrowed
        if (!item.isBorrowed()) {
            // If the item is available, approve the borrow request
            System.out.println("Librarian: Request approved for member " + member.getName() + " to borrow " + item.getTitle());
            return true;
        } else {
            // If the item is already borrowed, deny the borrow request
            System.out.println("Librarian: Request denied. Item is already borrowed.");
            return false;
        }
    }
}
