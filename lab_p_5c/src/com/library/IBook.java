package com.library;

public interface IBook {
    String getTitle();
    String getAuthor();
    String getISBN();
    boolean isAvailable();
    void setAvailable(boolean available);
}
