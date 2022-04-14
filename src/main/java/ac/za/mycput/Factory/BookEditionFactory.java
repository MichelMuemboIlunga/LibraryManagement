package ac.za.mycput.Factory;

/*
 * Project Term One
 * Author: Honest Mpungu
 * Student number 215072081
 * Date: 10 April 2022
 */

import ac.za.mycput.Entity.BookEdition;

public class BookEditionFactory {


    public static BookEdition createBookPublisher(String bookId, String isbn, String yearRelease) {
        return new BookEdition.Builder().setBookId(bookId).setIsbn(isbn).setYearRelease(yearRelease).build();
    }
}
