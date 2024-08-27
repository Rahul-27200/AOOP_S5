package com.library;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        
        IBook book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        IBook book2 = new Book("1984", "George Orwell", "9780451524935");

       
        IMember member1 = new Member("Alice", 1);
        IMember member2 = new Member("Bob", 2);

       
        IBorrowingService borrowingService = new BorrowingService();

        
        borrowingService.borrowBook(member1, book1);
        borrowingService.borrowBook(member2, book2);
        borrowingService.returnBook(member1, book1);

       
        System.out.println("Books borrowed by " + member1.getName() + ":");
        for (IBook book : member1.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }

        System.out.println("Books borrowed by " + member2.getName() + ":");
        for (IBook book : member2.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
