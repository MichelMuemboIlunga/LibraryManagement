/*
 * Entity for the BookReviewFactory
 * Author: Muembo Ilunga Michel (218303335)
 * Date: 10 April 2022
 */

package ac.za.mycput.Repository.BookReview;
import ac.za.mycput.Entity.BookReview;
import ac.za.mycput.Repository.IRepository;
import java.util.Set;

public interface IBookReviewRepository extends IRepository<BookReview, Integer>{
    public Set<BookReview> getAll();
}




