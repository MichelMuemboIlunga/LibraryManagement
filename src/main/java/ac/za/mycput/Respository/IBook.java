package ac.za.mycput.Respository;

import ac.za.mycput.Entity.Book;

import java.util.Set;

public interface IBook extends  IRepository<Book, Long>
{



    public Set<Book> getAll();
}

