package ac.za.mycput.Factory;

import ac.za.mycput.Entity.BookReservation;

public class BookReservationFactory {
    public static BookReservation createBookReservation(String creationDate, boolean status) {
        return new BookReservation.Builder().creationDate(creationDate).setStatus(status).build();
    }
}
