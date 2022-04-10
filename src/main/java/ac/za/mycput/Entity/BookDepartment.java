/*
 * Entity for the BookPublisher
 * Author: Emeka Thato Nwamadi (219404070)
 * Date: 10 April 2022
 */

package ac.za.mycput.Entity;

public class BookDepartment {

    private int bookId;
    private String bookName;
    private String description;

    public BookDepartment(BookDepartment.Builder builder) {
        this.bookId = builder.bookId;
        this.bookName = builder.bookName;
        this.description = builder.description;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "BookDepartment{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        private int bookId;
        private String bookName;
        private String description;


        public BookDepartment.Builder setBookId(int bookId) {
            this.bookId = bookId;
            return this;
        }

        public BookDepartment.Builder setBookName(String bookName) {
            this.bookName = bookName;
            return this;
        }

        public BookDepartment.Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public BookDepartment.Builder copy(BookDepartment bookdepartment) {
            this.bookId = bookdepartment.bookId;
            this.bookName = bookdepartment.bookName;
            this.description = bookdepartment.description;

            return this;
        }

        public BookDepartment build() {
            return new BookDepartment(this);
        }
    }
}
