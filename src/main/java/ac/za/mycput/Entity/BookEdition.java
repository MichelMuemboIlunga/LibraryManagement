package ac.za.mycput.Entity;
/*
 * Entity for the Book Edition
 * Project
 * Author: Honest Mpungu
 * Student number 215072081
 * Date: 10 April 2022
 */

public class BookEdition {
    private String bookId;
    private String isbn;
    private String yearRelease;

    public BookEdition(BookEdition.Builder builder) {
        this.bookId = builder.bookId;
        this.isbn = builder.isbn;
        this.yearRelease = builder.yearRelease;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String courseName) {
        this.isbn = isbn;
    }

    public String getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(String description) {
        this.yearRelease = yearRelease;
    }

    @Override
    public String toString() {
        return "BookEdition{" +
                "bookId='" + bookId + '\'' +
                ", isbn='" + isbn + '\'' +
                ", yearRelease='" + yearRelease + '\'' +
                '}';
    }

    public static class Builder {
        private String bookId;
        private String isbn;
        private String yearRelease;


        public BookEdition.Builder setBookId(String bookId) {
            this.bookId = bookId;
            return this;
        }

        public BookEdition.Builder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookEdition.Builder copy(BookEdition bookEdition) {
            this.bookId = bookEdition.bookId;
            this.isbn = bookEdition.isbn;
            this.yearRelease = bookEdition.yearRelease;

            return this;
        }

        public BookEdition build() {
            return new BookEdition(this);


        }
    }

}