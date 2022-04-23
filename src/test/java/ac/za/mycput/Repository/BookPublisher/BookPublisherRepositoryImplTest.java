/*
 * Entity for the BookReviewFactory
 * Author: Muembo Ilunga Michel (218303335)
 * Date: 10 April 2022
 */
package ac.za.mycput.Repository.BookPublisher;

import ac.za.mycput.Entity.BookPublisher;
import ac.za.mycput.Factory.BookPublisherFactory;
import ac.za.mycput.Repository.BookPublisher.Impl.BookPublisherImpl;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class BookPublisherRepositoryImplTest {

    private static BookPublisherImpl repository= BookPublisherImpl.getRepository();
    private  static BookPublisher bookPublisher = BookPublisherFactory.createBookPublisher(1,10,"Ilunga","Muembo", "Developer");

    @Test
    void create() {
        BookPublisher created =repository.create(bookPublisher);
        Assert.assertEquals(bookPublisher.getBookId(),created.getBookId());
        System.out.println("created"+created);
    }

    @Test
    void read() {
        BookPublisher read = repository.read(bookPublisher.getBookId());
        System.out.println("read: "+ read);
    }

    @Test
    void update() {
        BookPublisher updated = new BookPublisher.Builder().copy(bookPublisher).setBookId(2).setFirstName("Ilunga").setLastName("Muembo").setDescription("Developers").build();
        System.out.println("updated:" +updated);
    }

    @Test
    void delete() {
        boolean success = repository.delete(bookPublisher.getBookId());
        System.out.println("deleted"+success);

    }
    @Test
    void getAll() {
        System.out.println("show all");
        System.out.println(repository.getAll());

    }
}





