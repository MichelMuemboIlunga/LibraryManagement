
/*
 * Entity for the BookReviewFactory
 * Author: Muembo Ilunga Michel (218303335)
 * Date: 10 April 2022
 */

package ac.za.mycput.Repository.BookPublisher;
        import ac.za.mycput.Entity.BookPublisher;
        import ac.za.mycput.Repository.IRepository;
        import java.util.Set;

public interface IBookPublisherRepository extends IRepository<BookPublisher, Integer> {
    public Set<BookPublisher> getAll();
}




