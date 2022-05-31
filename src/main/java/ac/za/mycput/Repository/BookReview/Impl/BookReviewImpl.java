/*
 * Entity for the BookReviewFactory
 * Author: Muembo Ilunga Michel (218303335)
 * Date: 10 April 2022
 */

package ac.za.mycput.Repository.BookReview.Impl;
import ac.za.mycput.Entity.BookReview;
import ac.za.mycput.Repository.BookReview.IBookReviewRepository;

import java.util.HashSet;
import java.util.Set;


public class BookReviewImpl implements IBookReviewRepository {

    private static BookReviewImpl repository = null;
    private Set<BookReview> bookReviewsdb;

    public BookReviewImpl() {
        bookReviewsdb = new HashSet<BookReview>();
    }

    public static BookReviewImpl getRepository() {
        if (repository == null) {
            repository = new BookReviewImpl();
        }
        return repository;
    }

    @Override
    public BookReview create(BookReview bookReview) {
        boolean success = bookReviewsdb.add(bookReview);
        if(!success)
            return null;
        return bookReview;
    }



    @Override
    public BookReview read(Integer bookReviewId) {
        BookReview bookReview = bookReviewsdb.stream().filter(c-> c.getId() == (bookReviewId)).findAny().orElse(null);
        return bookReview;
    }

    @Override
    public BookReview update(BookReview bookReview) {
        BookReview bookReview1 =read(bookReview.getId());
        if(bookReview1 != null){
            bookReviewsdb.remove(bookReview1);
            bookReviewsdb.add(bookReview);
            return bookReview;
        }
        return null;
    }

    @Override
    public boolean delete(Integer bookReviewId) {
        BookReview bookReviewRemove =read(bookReviewId);
        if (bookReviewRemove == null)
            return false;
        bookReviewsdb.remove(bookReviewId);

        return true;
    }


    @Override
    public Set<BookReview> getAll() {
        return bookReviewsdb;
    }

}