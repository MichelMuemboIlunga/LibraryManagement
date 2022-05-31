package ac.za.mycput.Repository.BookReservation;


import ac.za.mycput.Entity.BookReservation;
import ac.za.mycput.Repository.IRepository;
import java.util.Set;

public interface IBookReservationRepository extends IRepository<BookReservation, String>{
    public Set<BookReservation> getAll();
}
