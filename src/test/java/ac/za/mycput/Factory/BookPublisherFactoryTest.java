
/*
 * Entity for the BookPublisherFactory
 * Author: Muembo Ilunga Michel (218303335)
 * Date: 10 April 2022
 */

package ac.za.mycput.Factory;

import org.junit.jupiter.api.Test;
import ac.za.mycput.Entity.BookPublisher;

import static org.junit.Assert.assertNotNull;

public class BookPublisherFactoryTest {

    @Test
    void createBookPublisher(){
        BookPublisher bookPublisher = BookPublisherFactory.createBookPublisher(1,10,"Ilunga","Muembo", "Developer");
        System.out.println(bookPublisher.toString());
        assertNotNull(bookPublisher);
    }
}