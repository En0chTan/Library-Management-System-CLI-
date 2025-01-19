# Library-Management-System-CLI📚-

This project demonstrates a Library Management System (LMS) that is designed and implemented using Object-Oriented Programming (OOP) principles and UML diagrams. The LMS provides functionalities to manage library items, handle borrowing and returning processes, calculate late fees, and track transactions seamlessly.

<b> Features </b>

1. Class Design and Hierarchy
Abstract class LibraryItem with attributes such as title, id, and status.
Subclasses: Book, Magazine, DVD, etc.
Implements polymorphism using the method calculateLateFee() for item-specific late fee calculations.

2. UML Class Diagram
Represents relationships between LibraryItem, Member, and Loan.
Includes inheritance, associations, and multiplicities:
A Member can borrow multiple Loans (1..*).
A Loan can involve multiple LibraryItems (1..*).
Documents the borrowing process, including interactions with a Librarian.

3. Event Handling and Polymorphism
Handles onBorrow and onReturn events to update item status and log transactions.
Polymorphic late fee calculation with calculateLateFee() tailored for each item type.

4. Program Execution
Console-based interface (or basic GUI) to: 
Borrow items and update their status to BORROWED.
Return items, calculate late fees, and update status to AVAILABLE.
Clear feedback for successful borrowing, returns, and late fee charges.
