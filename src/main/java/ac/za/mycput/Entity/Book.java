package ac.za.mycput.Entity;

public class Book {
    private Long bookId;
    private String bookName;
    private String language;

    public Long getBookId() {
        return bookId;
    }
    public Book(Builder builder) {
        this.bookId= builder.bookId;
        this.bookName = builder.bookName;
        this.language= builder.language;
    }

    public String getBookName() {
        return bookName;
    }

    public String getLanguage() {
        return language;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    public static class Builder{
        private Long bookId;
        private String bookName;
        private String language;

        public Builder setBookId(Long bookId) {
            this.bookId = bookId;
            return  this;
        }

        public Builder setBookName(String bookName) {
            this.bookName = bookName;
            return  this;
        }

        public Builder setLanguage(String language) {
            this.language = language;
            return  this;
        }

        public Builder copy(Book book) {
            this.bookId =book.bookId;
            this.bookName=book.bookName;
            this.language =book.language;

            return this;

        }
        public Book build() {
            return new Book(this);
        }

    }

    
}
