package ac.za.mycput.Repository.BookReservation.Impl;

import ac.za.mycput.Entity.BookReservation;
import ac.za.mycput.Repository.BookReservation.IBookReservationRepository;
import java.util.HashSet;
import java.util.Set;

public class BookReservationImpl implements IBookReservationRepository {

    private static ac.za.mycput.Repository.BookReservation.Impl.BookReservationImpl repos = null;
    private Set<BookReservation> bookReservationDb;

    public BookReservationImpl() {
        bookReservationDb = new HashSet<BookReservation>();
    }

    public static ac.za.mycput.Repository.BookReservation.Impl.BookReservationImpl getRepos() {
        if (repos == null) {
            repos = new ac.za.mycput.Repository.BookReservation.Impl.BookReservationImpl();
        }
        return repos;
    }

    @Override
    public BookReservation create(BookReservation bookReservation) {
        boolean success = bookReservationDb.add(bookReservation);
        if(!success)
            return null;
        return bookReservation;
    }

    @Override
    public BookReservation read(String creationDate) {
        BookReservation account = bookReservationDb.stream().filter(x-> x.getCreationDate() == creationDate).findAny().orElse(null);
        return account;
    }

    @Override
    public BookReservation update(BookReservation bookReservation) {
        BookReservation bookReservation1 = read(bookReservation.getCreationDate());
        if(bookReservation1 != null){
            bookReservationDb.remove(bookReservation1);
            bookReservationDb.add(bookReservation);
            return bookReservation;
        }
        return null;
    }

    @Override
    public boolean delete(String creationDate) {
        BookReservation bookReservationRemove = read(creationDate);
        if (bookReservationRemove == null)
            return false;
        bookReservationDb.remove(bookReservationRemove);

        return true;
    }


    @Override
    public Set<BookReservation> getAll() {
        return bookReservationDb;
    }

}

