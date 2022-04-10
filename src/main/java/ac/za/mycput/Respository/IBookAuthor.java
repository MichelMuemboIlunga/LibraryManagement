package ac.za.mycput.Respository;

import ac.za.mycput.Entity.BookAuthor;

import java.util.Set;

public interface IBookAuthor extends  IRepository<BookAuthor, Long>
{



    public Set<BookAuthor >getAll();
}