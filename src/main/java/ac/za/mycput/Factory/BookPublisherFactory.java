/*
 * Entity for the BookPublisher
 * Author: Muembo Ilunga Michel (218303335)
 * Date: 10 April 2022
 */
package ac.za.mycput.Factory;

import ac.za.mycput.Entity.BookPublisher;

public class BookPublisherFactory {
    public static BookPublisher createBookPublisher(int bookId, int publisherId, String firstName, String lastName, String description) {
        return new BookPublisher.Builder().setBookId(bookId).setPublisherId(publisherId).setFirstName(firstName).setLastName(lastName).setDescription(description).build();
    }
}


