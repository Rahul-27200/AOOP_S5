package com.library;

import java.util.List;

public interface IMember {
    String getName();
    int getMemberID();
    void borrowBook(IBook book);
    void returnBook(IBook book);
    List<IBook> getBorrowedBooks();
}
