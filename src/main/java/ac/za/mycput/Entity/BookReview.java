/*
 * Entity for the BookReviewFactory
 * Author: Muembo Ilunga Michel (218303335)
 * Date: 10 April 2022
 */

package ac.za.mycput.Entity;

public class BookReview {
    private int id;
    private int bookId;
    private String content;
    private String date;

    public BookReview(Builder builder) {
        this.id = builder.id;
        this.bookId = builder.bookId;
        this.content = builder.content;
        this.date = builder.date;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "BookReviewFactory{" +
                "id=" + id +
                ", bookId='" + bookId + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
    // Builder Class

    public static class Builder {
        private int id;
        private int bookId;
        private String content;
        private String date;


        public Builder setBookReviewId(int id) {
            this.id = id;
            return this;
        }

        public Builder setBookId(int bookId) {
            this.bookId = bookId;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder copy(BookReview bookReview) {
            this.id = bookReview.id;
            this.bookId = bookReview.bookId;
            this.content = bookReview.content;
            this.date = bookReview.date;

            return this;
        }

        public BookReview build() {
            return new BookReview(this);
        }
    }
}
