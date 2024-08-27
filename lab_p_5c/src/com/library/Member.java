package com.library;

import java.util.ArrayList;
import java.util.List;

public class Member implements IMember {
    private String name;
    private int memberID;
    private List<IBook> borrowedBooks;

    public Member(String name, int memberID) {
        this.name = name;
        this.memberID = memberID;
        this.borrowedBooks = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMemberID() {
        return memberID;
    }

    @Override
    public void borrowBook(IBook book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("The book " + book.getTitle() + " is currently not available.");
        }
    }

    @Override
    public void returnBook(IBook book) {
        if (borrowedBooks.remove(book)) {
            book.setAvailable(true);
            System.out.println(name + " returned the book: " + book.getTitle());
        } else {
            System.out.println("The book " + book.getTitle() + " was not borrowed by " + name + ".");
        }
    }

    @Override
    public List<IBook> getBorrowedBooks() {
        return borrowedBooks;
    }
}
