/*
 * Entity for the BookPublisher
 * Author: Muembo Ilunga Michel (218303335)
 * Date: 10 April 2022
*/

package ac.za.mycput.Entity;

public class BookPublisher {
    private int bookId;
    private int publisherId;
    private String firstName;
    private String lastName;
    private String description;

    public BookPublisher(Builder builder) {
        this.bookId = builder.bookId;
        this.publisherId = builder.publisherId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.description = builder.description;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "BookPublisher{" +
                "bookId=" + bookId +
                ", publisherId=" + publisherId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        private int bookId;
        private int publisherId;
        private String firstName;
        private String lastName;
        private String description;


        public BookPublisher.Builder setBookId(int bookId) {
            this.bookId = bookId;
            return this;
        }

        public BookPublisher.Builder setPublisherId(int publisherId) {
            this.publisherId = publisherId;
            return this;
        }

        public BookPublisher.Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public BookPublisher.Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public BookPublisher.Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public Builder copy(BookPublisher bookPublisher) {
            this.bookId = bookPublisher.bookId;
            this.publisherId = bookPublisher.publisherId;
            this.firstName = bookPublisher.firstName;
            this.lastName = bookPublisher.lastName;
            this.description = bookPublisher.description;

            return this;
        }

        public BookPublisher build() {
            return new BookPublisher(this);
        }

    }
}
