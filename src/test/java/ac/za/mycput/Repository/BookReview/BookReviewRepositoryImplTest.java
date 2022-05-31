/*
 * Entity for the BookReviewFactory
 * Author: Muembo Ilunga Michel (218303335)
 * Date: 10 April 2022
 */

package ac.za.mycput.Repository.BookReview;
import ac.za.mycput.Entity.BookReview;
import ac.za.mycput.Factory.BookReviewFactory;
import ac.za.mycput.Repository.BookReview.Impl.BookReviewImpl;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class BookReviewRepositoryImplTest {

    private static BookReviewImpl repository= BookReviewImpl.getRepository();
    private  static BookReview bookReview = BookReviewFactory.createBookReview(1,1,"programming","4/10/2022");

    @Test
    void create() {
        BookReview created =repository.create(bookReview);
        Assert.assertEquals(bookReview.getId(),created.getBookId());
        System.out.println("created"+created);
    }

    @Test
    void read() {
        BookReview read = repository.read(bookReview.getBookId());
        System.out.println("read: "+ read);
    }

    @Test
    void update() {
        BookReview updated = new BookReview.Builder().copy(bookReview).setBookId(2).setBookReviewId(20).setContent("developer").setDate("5/10/2022").build();
        System.out.println("updated:" +updated);
    }

    @Test
    void delete() {
        boolean success = repository.delete(bookReview.getBookId());
        System.out.println("deleted"+success);

    }
    @Test
    void getAll() {
        System.out.println("show all");
        System.out.println(repository.getAll());

    }
}

