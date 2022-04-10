/*
 * Entity for the BookReviewFactory
 * Author: Muembo Ilunga Michel (218303335)
 * Date: 10 April 2022
 */


package ac.za.mycput.Factory;

import ac.za.mycput.Entity.BookReview;

public class BookReviewFactory {
    public static BookReview createBookReview(int id, int bookId, String content, String date) {
        return new BookReview.Builder().setBookReviewId(id).setBookId(bookId).setContent(content).setDate(date).build();
    }

}
