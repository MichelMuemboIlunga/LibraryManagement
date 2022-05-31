/*
 * Entity for the BookReviewFactory
 * Author: Muembo Ilunga Michel (218303335)
 * Date: 10 April 2022
 */

package ac.za.mycput.Repository.BookPublisher.Impl;
import ac.za.mycput.Entity.BookPublisher;
import ac.za.mycput.Repository.BookPublisher.IBookPublisherRepository;

import java.util.HashSet;
import java.util.Set;


public class BookPublisherImpl implements IBookPublisherRepository {

    private static BookPublisherImpl repository = null;
    private Set<BookPublisher> bookPublisherDb;

    public BookPublisherImpl() {
        bookPublisherDb = new HashSet<BookPublisher>();
    }

    public static BookPublisherImpl getRepository() {
        if (repository == null) {
            repository = new BookPublisherImpl();
        }
        return repository;
    }

    @Override
    public BookPublisher create(BookPublisher bookPublisher) {
        boolean success = bookPublisherDb.add(bookPublisher);
        if(!success)
            return null;
        return bookPublisher;
    }



    @Override
    public BookPublisher read(Integer bookPublisherId) {
        BookPublisher bookPublisher = bookPublisherDb.stream().filter(b-> b.getPublisherId() == (bookPublisherId)).findAny().orElse(null);
        return bookPublisher;
    }

    @Override
    public BookPublisher update(BookPublisher bookPublisher) {
        BookPublisher bookReview1 =read(bookPublisher.getPublisherId());
        if(bookReview1 != null){
            bookPublisherDb.remove(bookReview1);
            bookPublisherDb.add(bookPublisher);
            return bookPublisher;
        }
        return null;
    }

    @Override
    public boolean delete(Integer bookPublisherId) {
        BookPublisher bookPublisherRemove =read(bookPublisherId);
        if (bookPublisherRemove == null)
            return false;
        bookPublisherDb.remove(bookPublisherId);

        return true;
    }


    @Override
    public Set<BookPublisher> getAll() {
        return bookPublisherDb;
    }

}