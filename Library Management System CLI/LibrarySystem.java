import java.util.*;

public class LibrarySystem {
    // Lists to store library items and members
    private static List<LibraryItem> libraryItems = new ArrayList<>();
    private static List<Member> members = new ArrayList<>();

    public static void main(String[] args) {
        // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Librarian object to manage the borrowing and returning of items
        Librarian librarian = new Librarian();

        // Adding sample items to the library
        libraryItems.add(new Book("B001", "Introduction to Java Programming"));
        libraryItems.add(new Book("B002", "Python for Dummies"));
        libraryItems.add(new Magazine("M001", "Wall Street Journal Tech Monthly"));
        libraryItems.add(new Magazine("M002", "Global Tech Insider"));
        libraryItems.add(new DVD("D001", "Ready Player One"));
        libraryItems.add(new DVD("D002", "The Big Shot"));

        // Adding sample members to the system
        members.add(new Member("M1001", "Enoch Tan"));
        members.add(new Member("M1002", "Casey Tea"));
        members.add(new Member("M1003", "Aiman Muqri"));
        members.add(new Member("M1004", "Ranjit Singh"));

        // Main menu loop to handle user inputs
        while (true) {
            // Displaying the menu
            System.out.println("\n==========================================");
            System.out.println("       < Welcome to the Library >         ");
            System.out.println("==========================================");
            System.out.println("1. 📚 Borrow Item");
            System.out.println("2. 🔄 Return Item");
            System.out.println("3. 📋 View Library Items");
            System.out.println("4. ➕ Add New Member");
            System.out.println("5. 📖 View Borrowed Items by Member");
            System.out.println("6. ❌ Exit");
            System.out.println("==========================================");
            System.out.print("👉 Please enter your choice: ");
            
            // Reading the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Handling the user's choice using a switch statement
            switch (choice) {
                case 1:
                    // Borrowing an item
                    System.out.print("Enter Member ID: ");
                    String memberId = scanner.nextLine();
                    Member borrowingMember = findMemberById(memberId); // Find the member by ID
                    if (borrowingMember == null) {
                        System.out.println("Member not found.");
                        break;
                    }

                    System.out.print("Enter Item ID: ");
                    String itemId = scanner.nextLine();
                    LibraryItem itemToBorrow = findItemById(itemId); // Find the item by ID
                    if (itemToBorrow == null) {
                        System.out.println("Item not found.");
                        break;
                    }

                    // Approving and borrowing the item
                    if (librarian.approveBorrowRequest(borrowingMember, itemToBorrow)) {
                        itemToBorrow.borrowItem();
                        borrowingMember.borrowItem(itemToBorrow);
                        System.out.println("Item borrowed successfully.");
                    }
                    break;

                case 2:
                    // Returning an item
                    System.out.print("Enter Member ID: ");
                    String returnMemberId = scanner.nextLine();
                    Member returningMember = findMemberById(returnMemberId); // Find the member by ID
                    if (returningMember == null) {
                        System.out.println("Member not found.");
                        break;
                    }

                    System.out.print("Enter Item ID: ");
                    String returnItemId = scanner.nextLine();
                    LibraryItem itemToReturn = findItemById(returnItemId); // Find the item by ID
                    if (itemToReturn == null) {
                        System.out.println("Item not found.");
                        break;
                    }

                    System.out.print("Enter days late: ");
                    int daysLate = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    // Calculating late fee and returning the item
                    double lateFee = itemToReturn.calculateLateFee(daysLate);
                    itemToReturn.returnItem();
                    returningMember.returnItem(itemToReturn);
                    System.out.println("Item returned successfully. Late Fee: $" + lateFee);
                    break;

                case 3:
                    // Viewing all library items
                    System.out.println("\nLibrary Items:");
                    for (LibraryItem item : libraryItems) {
                        System.out.println(item.getId() + " - " + item.getTitle() + " (" + (item.isBorrowed() ? "BORROWED" : "AVAILABLE") + ")");
                    }
                    break;

                case 4:
                    // Adding a new member
                    System.out.print("Enter New Member ID: ");
                    String newMemberId = scanner.nextLine();
                    System.out.print("Enter New Member Name: ");
                    String newMemberName = scanner.nextLine();
                    members.add(new Member(newMemberId, newMemberName)); // Add new member to the list
                    System.out.println("New member added successfully.");
                    break;

                case 5:
                    // Viewing items borrowed by a specific member
                    System.out.print("Enter Member ID: ");
                    String viewMemberId = scanner.nextLine();
                    Member viewMember = findMemberById(viewMemberId); // Find the member by ID
                    if (viewMember == null) {
                        System.out.println("Member not found :/");
                        break;
                    }

                    // Displaying borrowed items by the member
                    System.out.println("Items borrowed by " + viewMember.getName() + ":");
                    for (LibraryItem borrowedItem : viewMember.getBorrowedItems()) {
                        System.out.println(borrowedItem.getId() + " - " + borrowedItem.getTitle());
                    }
                    break;

                case 6:
                    // Exiting the system
                    System.out.println("Logging out of system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    // Invalid choice handling
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Helper method to find an item by its ID
    private static LibraryItem findItemById(String id) {
        for (LibraryItem item : libraryItems) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    // Helper method to find a member by their ID
    private static Member findMemberById(String id) {
        for (Member member : members) {
            if (member.getMemberId().equals(id)) {
                return member;
            }
        }
        return null;
    }
}
