Important Notes!!
Please use the following member ID to be able to use the system
        MEMBER ID       NAME
        M1001           Enoch Tan
        M1002           Casey Tea

(1) How to Use the Program
1. Compile all the .java files using the following command: 
   javac *.java
2. Run the main program: 
   java LibrarySystem
3. The program will display a menu of options in the console.


(2) Main Menu Options
When you start the program, you will see the following menu:

        ==========================================
                < Welcome to the Library >         
        ==========================================
        1. 📚 Borrow Item
        2. 🔄 Return Item
        3. 📋 View Library Items
        4. ➕ Add New Member
        5. 📖 View Borrowed Items by Member
        6. ❌ Exit
        ==========================================
        👉 Please enter your choice:    


Option 1: Borrow Item
1. Enter the Member ID when prompted.
   Example: M1001

2. Enter the Item ID of the item you want to borrow.
   Example: B001 (for a book), M001 (for a magazine), or D001 (for a DVD).

3. If the item is available, the program updates its status to BORROWED and logs the transaction.

4. If the item is already borrowed, the program displays a message indicating that it is unavailable.


Option 2: Return Item
1. Enter the Member ID when prompted.
   Example: M1001

2. Enter the Item ID of the item you want to return.
   Example: B001 (for a book), M001 (for a magazine), or D001 (for a DVD).

3. The program updates the item's status to AVAILABLE, calculates the late fee (if any), and logs the transaction.

4. Late fees are calculated based on the type of item and the number of days overdue.


Option 3: View Library Items

1. Displays a list of all library items along with their current statuses.
    Example:
    B001 - Introduction to Java Programming (BORROWED)
    M001 - Wall Street Journal Tech Monthly (AVAILABLE)
    D001 - Ready Player One (AVAILABLE)
    
    
Option 4: Add New Member
1. Select option 4 from the main menu.

2. The system will prompt you to enter the new Member ID.
    Example: Enter New Member ID: M2001

3. Next, you will be asked to enter the new Member Name.
    Example: Enter New Member Name: John Doe

4. Once the details are entered, the system will confirm the addition of the new member.
    Example: New member added successfully.

    
Option 5: View Borrowed Items by Member
1. Select option 5 from the main menu.

2. The system will prompt you to enter the Member ID of the member whose borrowed items you want to view.
    Example: Enter Member ID: M1001

3. The system will display a list of all items borrowed by the specified member.

4. If the entered Member ID does not exist, the system will notify you.
    Example: Member not found.

    
Option 6: Exit
1. Ends the program and returns to the command line.

Late Fee Calculation
The program calculates late fees based on the type of item:
    Book: $0.50 per day overdue
    Magazine: $0.25 per day overdue
    DVD: $1.00 per day overdue
    
    
