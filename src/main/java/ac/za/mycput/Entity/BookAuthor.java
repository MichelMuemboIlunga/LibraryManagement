package ac.za.mycput.Entity;

public class BookAuthor {
    private Long authorId;
    private int bookId;
    private String firstName;

    private String lastName;
    public BookAuthor(Builder builder) {
        this.authorId= builder.authorId;
        this.bookId = builder.bookId;
        this.firstName= builder.firstName;
        this.lastName= builder.lastName;
    }
    public Long getAuthorId() {
        return authorId;
    }

    public int getBookId() {
        return bookId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

   
    @Override
    public String toString() {
        return "BookAuthor{" +
                "authorId=" + authorId +
                ", bookId='" + bookId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    public static class Builder{
        private Long authorId;
        private int bookId;
        private String firstName;
        private String lastName;
        public Builder setAuthorId(Long authorId) {
            this.authorId = authorId;
            return  this;
        }

        public Builder setBookId(int bookId) {
            this.bookId = bookId;
            return  this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return  this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return  this;
        }



        public Builder copy(BookAuthor bookAuthor) {
            this.authorId =bookAuthor.authorId;
            this.bookId =bookAuthor.bookId;
            this.firstName =bookAuthor.firstName;
            this.lastName=bookAuthor.lastName;

            return this;

        }
        public BookAuthor build() {
            return new BookAuthor(this);
        }
    }
}
