package com.sszaicev.model;

import java.util.Objects;

public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private BookGenre  bookGenre;
    private BookStatus bookStatus;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && Objects.equals(bookName, book.bookName) && Objects.equals(bookAuthor, book.bookAuthor) && bookGenre == book.bookGenre && bookStatus == book.bookStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookName, bookAuthor, bookGenre, bookStatus);
    }

    @Override
    public String toString() {
        return "Book{" +
               "bookId=" + bookId +
               ", bookName='" + bookName + '\'' +
               ", bookAuthor='" + bookAuthor + '\'' +
               ", bookGenre=" + bookGenre +
               ", bookStatus=" + bookStatus +
               '}';
    }

    public Book(int bookId, String bookName, String bookAuthor, BookGenre bookGenre, BookStatus bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookGenre = bookGenre;
        this.bookStatus = bookStatus;



    }
}
