package com.library;

public class BorrowingService implements IBorrowingService {
    @Override
    public void borrowBook(IMember member, IBook book) {
        member.borrowBook(book);
    }

    @Override
    public void returnBook(IMember member, IBook book) {
        member.returnBook(book);
    }
}
