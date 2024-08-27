package com.library;

public interface IBorrowingService {
    void borrowBook(IMember member, IBook book);
    void returnBook(IMember member, IBook book);
}
