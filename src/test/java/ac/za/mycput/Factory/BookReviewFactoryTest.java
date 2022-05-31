
/*
 * Entity for the BookReviewFactory
 * Author: Muembo Ilunga Michel (218303335)
 * Date: 10 April 2022
 */

package ac.za.mycput.Factory;

import org.junit.jupiter.api.Test;
import ac.za.mycput.Entity.BookReview;

import static org.junit.Assert.assertNotNull;

public class BookReviewFactoryTest {

    @Test
    void createBookReview() {
        BookReview bookReview = BookReviewFactory.createBookReview(1,10,"Programming","4/10/2022");
        System.out.println(bookReview.toString());
        assertNotNull(bookReview);
    }
}



